public class bufferString {
    public static void main(String[] args) {
        String s1 = "Geeks";
        concat1(s1);
        System.out.println("String is :" + s1);
        StringBuffer s2 = new StringBuffer("Geeks");
        concat2(s2);
        System.out.println("StringBuffer :" + s2);
    }

    public static void concat1(String s1) {
        s1 = s1 + "forgeeks";

    }

    public static void concat2(StringBuffer s2) {
        s2.append("for geeks");

    }
}

