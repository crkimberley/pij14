/**
 * @author crkimberley on 27/10/2016.
 */
public class PrimeDivisorListImplScript {
    public static void main(String[] args) {
        new PrimeDivisorListImplScript().launch();
    }

    private void launch() {
        PrimeDivisorListImpl list = new PrimeDivisorListImpl();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        System.out.println(list);
    }

}
