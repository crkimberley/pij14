import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 23/10/2016.
 */
public class MergeSort {

    public static void mergeSort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(int[] numbers, int left, int right) {
        if (right <= left) {
            return;
        }
        int middle = (right + left) / 2;
        mergeSort(numbers, left, middle);
        mergeSort(numbers, middle + 1, right);
        merge(numbers, left, middle, right);
    }

    private static void merge(int[] numbers, int left, int middle, int right ) {
        int i, j;
        int[] temp = new int[right + 1];
        for (i = middle + 1; i > left; i--) {
            temp[i - 1] = numbers[i - 1];
        }
        for (j = middle; j < right; j++ ) {
            temp[right + middle - j] = numbers[j + 1];
        }
        for (int k = left; k <= right; k++) {
            if (temp[j] < temp[i]) {
                numbers[k] = temp[j--];
            } else {
                numbers[k] = temp[i++];
            }
        }
    }
}
