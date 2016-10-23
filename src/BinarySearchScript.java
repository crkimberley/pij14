import java.util.Arrays;
import java.util.List;

/**
 * @author crkimberley on 22/10/2016.
 */
public class BinarySearchScript {
    public static void main(String[] args) {
        new BinarySearchScript().launch();
    }

    private void launch() {
        List<Integer> sortedList = Arrays.asList(2, 8, 12, 14, 16, 19, 24, 28, 31, 33, 39, 40, 45, 49,
                51, 53, 54, 56, 57, 60, 63, 69, 77, 82, 88, 89, 94, 96, 97);

        System.out.println(BinarySearch.search(sortedList, 77));
        System.out.println(BinarySearch.search(sortedList, 14));
        System.out.println(BinarySearch.search(sortedList, 131));
    }
}
