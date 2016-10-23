import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 23/10/2016.
 */
public class Anagram {

    // Set 1st letter (loop through all in turn) then add all permutations of remaining letters

    public static List<String> permute(String word) {
        List<String> anagrams = new ArrayList<String>();
        return permute(anagrams, "", word);
    }

    private static List<String> permute(List<String> anagrams, String prefix, String word) {
        if (word.length() == 1) {
            anagrams.add(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permute(anagrams, prefix + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
            }
        }
        return anagrams;
    }
}
