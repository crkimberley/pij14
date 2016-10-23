import java.util.Arrays;
import java.util.List;

/**
 * @author crkimberley on 23/10/2016.
 */
public class MergeSortScript {
    public static void main(String[] args) {
        new MergeSortScript().launch();
    }

    private void launch() {
        int [] numberList = {645, 33, 912, 4446, 25, 70123, 89, 99, 103, 23, 111};
        MergeSort.mergeSort(numberList);
        System.out.println(Arrays.toString(numberList));
    }
}
