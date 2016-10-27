import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author crkimberley on 27/10/2016.
 */
public class NumberInput2 {

    public void average2() {
        double sum = 0;
        System.out.print("How many numbers would you like to enter: ");
        int numberOfNumbers = getInt();
        for (int i=0; i<numberOfNumbers; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum = sum + getInt();
        }
        System.out.println("Mean of the numbers entered = " + (sum / numberOfNumbers));
    }

    public int getInt() {
        Scanner input;
        for (;;) {
            try {
                input = new Scanner(System.in);
                return input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.print("That's not an integer - please try again: ");
            }
        }
    }
}
