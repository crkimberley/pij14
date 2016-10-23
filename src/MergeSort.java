import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author crkimberley on 23/10/2016.
 */
public class MergeSort {

    public static void mergeSort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(numbers, left, middle);
            mergeSort(numbers, middle + 1, right);
            merge(numbers, left, middle, right);
        }
    }

    private static void merge(int[] numbers, int left, int middle, int right) {
        int[] tempL = Arrays.copyOfRange(numbers, left, middle + 1);
        int[] tempR = Arrays.copyOfRange(numbers, middle + 1, right + 1);

        for (int i = 0, j = 0, k = left; k <= right; k++) {
            if (i == tempL.length) {
                numbers[k] = tempR[j++];
                continue;
            }
            if (j == tempR.length) {
                numbers[k] = tempL[i++];
                continue;
            }
            numbers[k] = tempL[i] < tempR[j] ? tempL[i++] : tempR[j++];
        }
    }
/*
    private static void merge(int[] numbers, int left, int middle, int right ) {
        int i, j;
        int[] temp = new int[numbers.length];
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
 */
}
