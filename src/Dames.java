import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 23/10/2016.
 */
public class Dames {

    // Reworked Anagrams algorithm
    // using permutations of the string "01234567" for the arrangements of queens/dames
    // Calculate all permutations - queens will be alone on their rows and columns
    // then check if any other queens are on the same diagonal before adding solution to list
    //
    // Could easily convert strings to arrays of booleans, as in original question, if required
    
    public static List<String> solve8Dames() {
        return permute(new ArrayList<String>(), "", "01234567");
    }

    private static List<String> permute(List<String> solutions, String prefix, String solution) {
        if (solution.length() == 0) {
            // Permutation calculated - now check solution for diagonal clashes
            boolean diagonalsClear = true;
            for (int i=0; diagonalsClear && i<8; i++) {
                for (int j=0; j<i; j++) {
                    // Check for previously added queens on the diagonals
                    if (Math.abs(Character.getNumericValue(prefix.charAt(i)) - Character.getNumericValue(prefix.charAt(j))) == i - j) {
                        diagonalsClear = false;
                        break;
                    }
                }
            }
            if (diagonalsClear) solutions.add(prefix);
        } else {
            for (int i = 0; i < solution.length(); i++) {
                permute(solutions, prefix + solution.charAt(i), solution.substring(0, i) + solution.substring(i+1, solution.length()));
            }
        }
        return solutions;
    }

    public static void printBoard(String solution) {
        System.out.println();
        for (int i=0; i<8; i++) {
            int positionOnRow = Character.getNumericValue(solution.charAt(i));
            for (int j=0; j<8; j++) {
                System.out.print(j == positionOnRow ? " Q " : " • " );
            }
            System.out.println();
        }
        System.out.println();
    }
}
