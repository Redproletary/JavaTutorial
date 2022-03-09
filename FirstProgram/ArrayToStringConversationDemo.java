package FirstProgram;

public class ArrayToStringConversationDemo {
    public static String smash(String... words) {
        return String.join(" ", words);
    } // smash(String) method

    public static void main(String[] args) {
        System.out.println(smash( "Bilal", "Djaghout"));
    } // main(String[]) method
} // ArrayToStringConversationDemo class
