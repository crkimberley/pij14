/**
 * @author crkimberley on 26/10/2016.
 */
public class PolynomialScript {

    public static void main(String[] args) {
        new PolynomialScript().launch();
    }

    private void launch() {
        int[] functionA = {-2, -1, 0, 1};
        System.out.println("\n" + Polynomial.root(functionA));
        int[] functionB = {10, -2, -5, 1};
        System.out.println("\n" + Polynomial.root(functionB));
        int[] functionC = {1, 2};
        System.out.println("\n" + Polynomial.root(functionC));
        int[] functionD = {2, -7, -1, 2};
        System.out.println("\n" + Polynomial.root(functionD));
    }
}
