import java.util.List;

/**
 * @author crkimberley on 26/10/2016.
 */
public class DamesScript {
    public static void main(String[] args) {
        new DamesScript().launch();
    }

    private void launch() {
        List<String> solutions = Dames.solve8Dames();
        System.out.println("Number of solutions found = " + solutions.size());
        for (String solution : solutions) {
            System.out.println(solution);
            Dames.printBoard(solution);
        }
    }
}
