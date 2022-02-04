package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class StringDelete {
    public static String[] strings = new String[6];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scan.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String curElem = strings[i];
            for (int k = i + 1; k < strings.length; k++) {
                if (curElem == null) {
                    break;
                } else if (curElem.equals(strings[k])) {
                    strings[i] = null;
                    strings[k] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + ", ");
        }
    }
}
