import java.util.Arrays;
import java.util.Random;

/**
 * @author crkimberley on 23/10/2016.
 */
public class MergeSortScript {

    Random random = new Random();
    int[] randomList;

    public static void main(String[] args) {
        new MergeSortScript().launch();
    }

    private void launch() {
        int RANDOM_LIST_SIZE = 10000;
        int [] numberList = {645, 33, 912, 4446, 25, 70123, 89, 99, 103, 23, 111};
        MergeSort.mergeSort(numberList);
        System.out.println(Arrays.toString(numberList));
        randomList = new int[RANDOM_LIST_SIZE];
        for (int i=0; i<RANDOM_LIST_SIZE; i++) {
            randomList[i] = random.nextInt(10000);
        }
        MergeSort.mergeSort(randomList);
        printArrayEnds(randomList);
    }

    private void printArrayEnds(int[] ints) {
        if (ints.length < 20) {
            System.out.println(Arrays.toString(ints));
            return;
        }
        int[] start = Arrays.copyOfRange(ints, 0, 10);
        int[] end = Arrays.copyOfRange(ints, ints.length - 10, ints.length);
        System.out.print(Arrays.toString(start) + " ... " + Arrays.toString(end));
    }
}
