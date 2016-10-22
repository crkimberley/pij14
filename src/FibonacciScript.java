/**
 * @author crkimberley on 21/10/2016.
 */
public class FibonacciScript {
    public static void main(String[] args) {
        new FibonacciScript().launch();
    }

    private void launch() {
        int n = 199;
        Fibonacci fibonacci = new Fibonacci();

        //System.out.print("Non-memoized using int (n = 46): ");
        //System.out.println(fibonacci.fib(46));
        System.out.print("Memoized: ");
        System.out.println(fibonacci.fibMemoized(n));
        System.out.print("Mapped: ");
        System.out.println(fibonacci.fibMapped(n));
    }
}
