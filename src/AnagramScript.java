/**
 * @author crkimberley on 23/10/2016.
 */
public class AnagramScript {
    public static void main(String[] args) {
        new AnagramScript().launch();
    }

    private void launch() {
        System.out.println(Anagram.permute("x"));
        System.out.println(Anagram.permute("bo"));
        System.out.println(Anagram.permute("dan"));
        System.out.println(Anagram.permute("jake"));
    }
}
