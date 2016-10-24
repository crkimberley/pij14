import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author crkimberley on 23/10/2016.
 */
public class SortScript {

    Random random = new Random();
    int[] randomArray;

    public static void main(String[] args) {
        new SortScript().launch();
    }

    private void launch() {
        int RANDOM_LIST_SIZE = 10000;
        int [] numberList = {645, 33, 912, 4446, 25, 70123, 89, 99, 103, 23, 111};
        MergeSort.mergeSort(numberList);
        System.out.println(Arrays.toString(numberList));
        randomArray = new int[RANDOM_LIST_SIZE];
        for (int i=0; i<RANDOM_LIST_SIZE; i++) {
            randomArray[i] = random.nextInt(10000);
        }
        MergeSort.mergeSort(randomArray);
        printArrayEnds(randomArray);
        for (int i=0; i<RANDOM_LIST_SIZE; i++) {
            randomArray[i] = random.nextInt(10000);
        }
        QuickSort.quickSort(randomArray);
        printArrayEnds(randomArray);
        System.out.print("Search for 9997 in mergeSorted list with binarySearch...");
        System.out.println(BinarySearch.search(intArrayToList(randomArray), 9997));
    }

    private void printArrayEnds(int[] ints) {
        if (ints.length < 20) {
            System.out.println(Arrays.toString(ints));
            return;
        }
        int[] start = Arrays.copyOfRange(ints, 0, 10);
        int[] end = Arrays.copyOfRange(ints, ints.length - 10, ints.length);
        System.out.println(Arrays.toString(start) + " ... " + Arrays.toString(end));
    }

    private List<Integer> intArrayToList(int[] intArray) {
        List<Integer> integerList = new ArrayList<Integer>();
        for (int number : intArray) {
            integerList.add(number);
        }
        return integerList;
    }
}
