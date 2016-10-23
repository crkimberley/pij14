import java.util.List;

/**
 * @author crkimberley on 22/10/2016.
 */
public class BinarySearch {

    public static boolean search(List<Integer> list, int value) {
        return search(list, value, 0, list.size() - 1);
    }

    private static boolean search(List<Integer> list, int value, int left, int right) {
        // Not found
        if (left > right) {
            return false;
        }
        int middle = (left + right) / 2;
        // Found
        if (value == list.get(middle)) {
            return true;
        }
        // Search lower half if value < middle element
        if (value < list.get(middle)) {
            return search(list, value, left, middle - 1);
        }
        // Search upper half if value > middle element
        else {
            return search(list, value, middle + 1, right);
        }
    }
}