package FirstProgram;

import java.util.Arrays;

public class StringToArrayConversationDemo {
    public static String[] stringToArray(String s) {
        String[] stringToArray = s.split(String.valueOf(' '));
        return stringToArray;
    } // stringToArray(String) method

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    } // main(String[])
} // StringToArrayConversationDemo class
