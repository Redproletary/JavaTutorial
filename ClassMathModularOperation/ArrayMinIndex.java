package ClassMathModularOperation;

import java.util.Scanner;

public class ArrayMinIndex {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = ints[0];
        for(int i =0; i < ints.length;i++){
            min = Math.min(min,ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int[] Array = new int[10];
        for (int i = 0; i < 10; i++) {
            Array[i] = console.nextInt();
        }
        return Array;
    }
}
