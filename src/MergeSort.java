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

    // Abstract in-place merge - from Sedgewick
    // "...merges without using sentinels by copying 2nd array into temp
    // in reverse order, back to back with the first
    // 1st for loop moves 1st array and leaves i pointing to left, ready to begin merge
    // 2nd for loop moves 2nd array and leaves j pointing to right
    // In the merge (3rd for loop), largest element serves as sentinel in whichever array it is
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
            numbers[k] = temp[j] < temp[i] ? temp[j--] : temp[i++];
        }
    }

    /*
    // Basic merge - from Sedgewick
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
    */
}
