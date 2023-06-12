import java.util.StringTokenizer;

public class count_words_method {
    public static void main(String[] args) {
        String s = " hello my name is charvi ";
        System.out.println("Total words are " + countWordsUsingSplit(s));
    }

    public static int countWordsUsingSplit(String input) {
        StringTokenizer tokens = new StringTokenizer(input);
        return tokens.countTokens();
    }
}
