/**
 * @author crkimberley on 19/10/2016.
 */
public class Doggy {
    public static void main(String[] args) {
        new Doggy().launch();
    }

    private void launch() {
        Doggy doggy = new Doggy();
        System.out.println(doggy.doggyMethod(10));
    }

    // Q1a - Method to fix
    /*
    String doggyMethod(int n) {
        String result = doggyMethod(n-3) + n + doggyMethod(n-2);
        if (n <= 0) {
            return "";
        }
        return result;
    }
    */

    // Fixed: moved check for n<=0 to correct place
    String doggyMethod(int n) {
        if (n <= 0) {
            return "";
        }
        String result = doggyMethod(n-3) + n + doggyMethod(n-2);
        return result;
    }
}
