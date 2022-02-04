package Arrays;

import java.util.Scanner;

public class MultiArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        if (N > 0) {
            multiArray = new int[N][];
            for (int i=0; i<multiArray.length;i++){
                N = console.nextInt();
                multiArray [i] = new int[N];
            }
        }
    }
}
