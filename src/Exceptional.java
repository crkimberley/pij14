import java.util.LinkedList;
import java.util.List;

/**
 * @author crkimberley on 27/10/2016.
 */

// Q2 - some example exception code
public class Exceptional {
    public static void main(String[] args) {
        new Exceptional().launch();
    }

    private void launch() {
        List<Integer> list = new LinkedList<Integer>();
        try {
            //list.get(1);
            list = null;
            list.add(37);
        } catch (NullPointerException ex) {
            System.out.println("Ooh - a null pointer exception I think!");
            ex.printStackTrace();
            // Moved following catch clause
        } catch (Exception ex) {
            System.out.println("Err...could be any exception!");
            ex.printStackTrace();
        }
    }
}
