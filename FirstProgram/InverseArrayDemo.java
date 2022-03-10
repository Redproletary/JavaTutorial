package FirstProgram;

import java.util.Arrays;

public class InverseArrayDemo {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = - array[i];
        } // for(i)
        return array;
    } // invert(int[]) method

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[ ]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(invert(new int[ ]{1,-2,3,-4,5})));
        System.out.println(Arrays.toString(invert(new int[ ]{})));
        System.out.println(Arrays.toString(invert(new int[ ]{0})));
    } // main(String[]) method
} // InverseArrayDemo class
