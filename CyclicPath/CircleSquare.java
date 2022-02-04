package CyclicPath;

import java.util.Scanner;

public class CircleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int S = (int)(3.14 * radius * radius);
        if (radius > 0) {
            System.out.println(S);
        }
    }
}
