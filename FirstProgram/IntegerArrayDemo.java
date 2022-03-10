package FirstProgram;

import java.util.Arrays;

public class IntegerArrayDemo {
    public static int[] reverse(int n){
        int[] arr = new int[n];
        for (n = 0; n < arr.length; n++) {
            arr[n] = arr.length - n;
        } // for(i)
        return arr;
    } // reverse(int) method

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    } // main(String[]) method

} // IntegerArrayDemo class
