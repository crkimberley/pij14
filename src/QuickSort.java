/**
 * @author crkimberley on 24/10/2016.
 */
public class QuickSort {

    public static void quickSort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = partition(numbers, left, right);
        quickSort(numbers, left, i - 1);
        quickSort(numbers, i + 1, right);
    }

    // Using Sedgewick method
    private static int partition(int[] numbers, int left, int right) {
        // i & j are left & right scan pointers
        int i = left - 1;
        int j = right;
        // value = value of partitioning element numbers[right]
        int value = numbers[right];
        // Partitioning loop - increments i and decrements j
        for (;;) {
            // maintain invariant property - no elements left of i are > value
            while (numbers[++i] < value);
            // maintain invariant property - no elements right of j are < value
            while (value < numbers[--j]) {
                // test j==left in case partitioning element is smallest in file
                if (j == left) break;
            }
            // Pointers meet
            if (i >= j) break;
            exchangeArrayElements(numbers, i, j);
        }
        // Complete partitioning by exchanging numbers[i] & numbers[right]
        // which puts value into numbers[i]
        exchangeArrayElements(numbers, i, right);
        return i;
    }
    
    private static void exchangeArrayElements(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
