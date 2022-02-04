package Types;

import java.util.Scanner;

public class StringReader {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        String string1 = a.nextLine();
        String string2 = b.nextLine();
        String string3 = c.nextLine();



        System.out.println (string3);
        System.out.println (string2.toUpperCase ());
        System.out.println (string1.toLowerCase ());


    }
}
