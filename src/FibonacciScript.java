/**
 * @author crkimberley on 21/10/2016.
 */
public class FibonacciScript {
    public static void main(String[] args) {
        new FibonacciScript().launch();
    }

    private void launch() {
        int n = 199;

        //System.out.print("Non-memoized using int (n = 46): ");
        //System.out.println(fibonacci.fib(46));
        System.out.print("Memoized: ");
        System.out.println(Fibonacci.fibMemoized(n));
        System.out.print("Mapped: ");
        System.out.println(Fibonacci.fibMapped(n));
    }
}
