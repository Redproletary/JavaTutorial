package FirstProgram;

public class AlwaysSayYesDemo {
    public static String boolToWord(boolean b)
    {
        if(b == true) System.out.println("Yes");
        else System.out.println("No");
        return String.valueOf(b);
    } // boolToWord(boolean) method

    public static void main(String[] args) {

        boolToWord(false);
        boolToWord(true);
    } // main(String[]) method
} // AlwaysSayYesDemo class
