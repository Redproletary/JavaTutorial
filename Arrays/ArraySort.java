package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        Arrays.sort(array);
        String str = Arrays.toString(array);
        System.out.println(str);
        //System.out.println(Arrays.toString(array));
    }
}
