package Types;

public class ToUpperCase {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
