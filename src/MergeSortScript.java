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
        int [] numberList = {645, 33, 912, 4446, 25, 70123, 89, 99, 103, 23, 111};
        MergeSort.mergeSort(numberList);
        System.out.println(Arrays.toString(numberList));
        randomList = new int[50];
        for (int i=0; i<50; i++) {
            randomList[i] = random.nextInt(100);
        }
        MergeSort.mergeSort(randomList);
        System.out.println(Arrays.toString(randomList));
    }
}
