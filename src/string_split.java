import java.util.Arrays;

public class string_split {
    public static void main(String[] args) {
        String text = new String("hello my name is charvi");
        String[] sentences = text.split("m", 2);
        System.out.println(Arrays.toString(sentences));
    }
}
