/**
 * @author crkimberley on 27/10/2016.
 */
public interface PrimeDivisorList {

    /*
     * @param Integer to add to the list
     */

    void add(Integer number) throws NullPointerException, IllegalArgumentException;

    /*
     * @return Integer from list
     */
    Integer remove();

    /*
     * @return formatted String representation of list
     */
    @Override
    String toString();
}
