package Strings;

public class StringPool {
    public static void main(String[] args) {
        String first = new String("VKontakte");
        String second = new String("VKontakte");
        String third = new String("vkontakte");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String a = first.intern();
        String b = second.intern();

        return (a == b);
    }
}
