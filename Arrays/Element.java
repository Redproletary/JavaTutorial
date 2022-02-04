package Arrays;

import java.util.Arrays;

public class Element {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        //for (int i = 0; i < 9; i++) {
        int index = Arrays.binarySearch(array2, element);
        if (index >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //}
    }
}
