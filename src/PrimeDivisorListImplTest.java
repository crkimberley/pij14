import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author crkimberley on 27/10/2016.
 */
public class PrimeDivisorListImplTest {
    private PrimeDivisorList list;

    @Before
    public void setUp() throws Exception {
        list = new PrimeDivisorListImpl();
    }

    @Test
    public void testAddIntegerThenRemove() throws Exception {
        list.add(13);
        Integer expected = 13;
        assertEquals(expected, list.remove(0));
    }

    @Test
    public void testAdd2IntegersThenRemoveBoth() {
        list.add(13);
        list.add(7);
        Integer expected0Index = 13;
        Integer expected1Index = 7;
        assertEquals(expected1Index, list.remove(1));
        assertEquals(expected0Index, list.remove(0));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullThrowsNullPointerException() throws Exception {
        list.add(null);
    }
}