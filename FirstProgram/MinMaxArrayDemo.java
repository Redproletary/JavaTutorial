package FirstProgram;

import java.util.Arrays;

public class MinMaxArrayDemo {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        } // for(i)
        return new int[]{min, max};
    } // minMax(int[]) method

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{2334454, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{1})));
    } // main(String[]) method

} // MinMaxArrayDemo
