package Arrays;

import java.util.Scanner;

public class Max {
    public static int[] array;
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < N; i++) {
            int number = array[i];
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
    }
