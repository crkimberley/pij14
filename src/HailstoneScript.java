/**
 * @author crkimberley on 22/10/2016.
 */
public class HailstoneScript {
    public static void main(String[] args) {
        new HailstoneScript().launch();
    }

    private void launch() {
        System.out.println(new Hailstone().hailstoneSequence(27));
    }
}
