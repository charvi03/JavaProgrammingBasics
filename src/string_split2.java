import java.util.Arrays;

public class string_split2 {
    public static void main(String[] args) {
        String text = new String("Hello my name is charvi khurana");
        String[] sen = text.split("i", 3);
        System.out.println(Arrays.toString(sen));
    }
}
