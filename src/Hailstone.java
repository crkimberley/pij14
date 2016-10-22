import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 22/10/2016.
 */
public class Hailstone {
    private List<Integer> list = new ArrayList<Integer>();

    public List<Integer> hailstoneSequence(int n) {
        list.add(n);
        if (n == 1) {
            return list;
        }
        return hailstoneSequence((n % 2 == 0) ? n / 2 : 3 * n + 1);
    }
}