package Arrays;

import java.util.Scanner;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int number = scanner.nextInt();

        //for (int i = 0; i < number; i++) {
        //if (number < 0) continue;
        // int number1 = scanner.nextInt();
        // }
        int N = scanner.nextInt();
        int[] arr = new int[N];
        if (N > 0) {
            for (int i = 0; i < N; i++)
                arr[i] = scanner.nextInt();
            if (N % 2 > 0) {
                for (int i = 0; i < arr.length; i++)
                    System.out.println(arr[i]);
            } else {
                for (int i = arr.length - 1; i >= 0; i--)
                    System.out.println(arr[i]);
            }
        }
    }
}
