/**
 * @author crkimberley on 26/10/2016.
 */
public class Polynomial {

    public final static double LOWER_LIMIT_PRECISION = 0.001;
    public final static double RESULT_PRECISION = 0.000001;

    public static double root(int[] polynomial) {
        double lowerLimit = oppositeSignInterval(polynomial);
        if (lowerLimit > 1000) {
            System.out.print("\nNo root between -1000 & 1000\t*** ERROR CODE 5000 WILL BE RETURNED *** ");
            return lowerLimit;
        }
        return root(polynomial, lowerLimit, 1000);
    }

    private static double root(int[] polynomial, double lowerLimit, double upperLimit) {
        double midPoint = (lowerLimit + upperLimit) / 2;
        if (Math.abs(eval(polynomial, midPoint)) < RESULT_PRECISION) {
            return midPoint;
        }
        if (eval(polynomial, lowerLimit) * eval(polynomial, midPoint) < 0) {
            upperLimit = midPoint;
        } else {
            lowerLimit = midPoint;
        }
        return root(polynomial, lowerLimit, upperLimit);
    }

    public static double eval(int[] polynomial, double x) {
        double result = polynomial[0];
        for (int i=1; i<polynomial.length; i++) {
            result = result + polynomial[i] * Math.pow(x, i);
        }
        return result;
    }

    public static double oppositeSignInterval(int[] polynomial) {
        for (double a = -1000; a < 1000; a = a + LOWER_LIMIT_PRECISION) {
            if (eval(polynomial, a) * eval(polynomial, 1000) < 0) {
                return a;
            }
        }
        return 5000;
    }
}
