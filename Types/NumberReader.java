package Types;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        int first = a.nextInt();
        int second = b.nextInt();
        int third = c.nextInt();
        int result = first + second + third;
        int result1 = result / 3;
        System.out.println(result1);

    }
}
