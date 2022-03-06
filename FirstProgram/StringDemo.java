package FirstProgram;

public class StringDemo {
    public static String disemvowel(String str) {
        // Code away...

        String[] engvow = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for(int i = 0; i < engvow.length; i++){
            str = str.replace(engvow[i],"");
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("London is the capital of Great Britain."));

    }
} // StringDemo class
