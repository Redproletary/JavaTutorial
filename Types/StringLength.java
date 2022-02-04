package Types;

public class StringLength {
    public static void main(String[] args) {
        String emptyString = "";
        System.out.println(emptyString.length());

        System.out.println("London is the Capital of Great Britain".length());

        System.out.println((emptyString + 5 + 5 + "55").length());
    }
}
