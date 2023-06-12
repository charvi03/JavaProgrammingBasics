import java.util.StringTokenizer;

public class string_tokens {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is ", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
