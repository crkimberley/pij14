import java.util.LinkedList;
import java.util.List;

/**
 * @author crkimberley on 27/10/2016.
 */
public class PrimeDivisorListImpl implements PrimeDivisorList {
    private List<Integer> list = new LinkedList<Integer>();

    @Override
    public void add(Integer number) throws NullPointerException, IllegalArgumentException {
        if (number == null) {
            throw new NullPointerException();
        } else {
            list.add(number);
        }
    }

    @Override
    public Integer remove(int index) {
        return list.remove(index);
    }
}
