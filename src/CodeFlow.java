import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 27/10/2016.
 */
public class CodeFlow {

    public static void main(String[] args) {
        System.out.println("User input 0");
        new CodeFlow().launch(0);
        System.out.println("User input 2");
        new CodeFlow().launch(2);
        System.out.println("User input 4");
        new CodeFlow().launch(4);
        System.out.println("User input 6");
        new CodeFlow().launch(6);
    }

    public void launch(int userInput) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}