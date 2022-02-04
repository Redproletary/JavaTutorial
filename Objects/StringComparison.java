package Objects;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = new String("VKontakte");
        s1 = "VKontakte";
        String s2 = "VKontakteh";
//        s2 = new String("VKontakte");
        String s3 = "VKontakte";
//        s3 = new String("VKontakte");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
