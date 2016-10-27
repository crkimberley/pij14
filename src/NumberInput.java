import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author crkimberley on 27/10/2016.
 */
public class NumberInput {

    public void average() {
        Scanner input;
        int inputCount = 1;
        double sum = 0;
        for (int i=1; i<=10; i++) {
            System.out.print("Enter number " + i + ": ");
            try {
                input = new Scanner(System.in);
                sum = sum + input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("No - that wasn't a number!");
                i--;
            }
        }
        System.out.println("Mean of the 10 numbers entered = " + (sum / 10));
    }
}
