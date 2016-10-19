/**
 * @author crkimberley on 19/10/2016.
 */
public class McCarthy91 {
    public static void main(String[] args) {
        new McCarthy91().launch();
    }

    private void launch() {
        McCarthy91 mcCarthy91 = new McCarthy91();
        System.out.println("Result for n = 50 is " + mcCarthy91.mcCarthy91(50) + "\n");
        System.out.println("Result for n = 73 is " + mcCarthy91.mcCarthy91(73) + "\n");
        System.out.println("Result for n = 95 is " + mcCarthy91.mcCarthy91(95) + "\n");
    }

    int mcCarthy91(int n) {
        if (n > 100) {
            System.out.println("n  > 100, n = " + n + "\t\tn - 10 = " + (n-10));
            return n - 10;
        } else {
            System.out.println("n <= 100, n = " + n + "\t\tn + 11 = " + (n+11));
            return mcCarthy91(mcCarthy91(n+11));
        }
    }
}
