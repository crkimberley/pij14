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
        } else if (!isPrime(number)){
            throw new IllegalArgumentException();
        } else {
            list.add(number);
        }
    }

    @Override
    public Integer remove(int index) {
        return list.remove(index);
    }

    private boolean isPrime(Integer number) {
        for (int i=2; i<number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        int product = 1;
        for (int i=0; i<list.size(); i++) {
            int number = list.get(i);
            product = product * number;
            sb.append(i != list.size() -1 ? number + " * " : number + " = " + product + " ]");
        }
        return sb.toString();
    }
}
