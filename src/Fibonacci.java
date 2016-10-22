import java.util.HashMap;
import java.util.Map;

/**
 * @author crkimberley on 21/10/2016.
 */
public class Fibonacci {

    private long[] fibArray = null;
    private Map<Integer, Long> fibMap;

/*
    public long fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            long result = fib(n-1) + fib(n-2);
            return result;
        }
    }
*/
    public long fibMemoized(int n) {
        if (fibArray == null) {
            initialiseFibArray(n);
        }
        if (fibArray[n] != -1) {
            return fibArray[n];
        }
        fibArray[n] = fibMemoized(n-1) + fibMemoized(n-2);
        return fibArray[n];
    }

    private void initialiseFibArray(int size) {
        fibArray = new long[size+1];
        for (int i=0; i<=size; i++) {
            fibArray[i] = -1;
        }
        fibArray[1] = 1;
        fibArray[2] = 1;
    }

    public long fibMapped(int n) {
        if (fibMap == null) {
            fibMap = new HashMap<Integer, Long>();
            fibMap.put(1, 1L);
            fibMap.put(2, 1L);
        }
        if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        }
        fibMap.put(n, fibMapped(n-1) + fibMapped(n-2));
        return fibMap.get(n);
    }
}
