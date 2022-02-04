package CyclicPath;

import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if ((i < min2) && (i != min1)) {
                min2 = i;
            }
        }
        System.out.println(min2);
    }
}
