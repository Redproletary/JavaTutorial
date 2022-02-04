package CyclicPath;

import java.util.Scanner;

public class WindSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x = (int) Math.round(3.6 * a);
        System.out.println(x);
    }
}
