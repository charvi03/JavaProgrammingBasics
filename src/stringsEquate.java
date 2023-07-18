public class stringsEquate {
    public static void main(String[] args) {
        String s1="Charvi";
        String s2="Khurana";
        String s3="Charvi";
        String s4=new String("Charvi");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
    }
}
