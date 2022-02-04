package Strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenyzer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer str = new StringTokenizer(query, delimiter);
        String[] arrstr = new String[str.countTokens()];
        int i = 0;
        while (str.hasMoreTokens()) {
            arrstr[i] = str.nextToken();
            i++;
        }

        return arrstr;
    }
}
