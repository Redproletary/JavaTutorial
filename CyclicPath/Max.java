package CyclicPath;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if ((x >= max) && (x % 2 == 0))
                max = x;
        }
        System.out.println(max);
    }
}
