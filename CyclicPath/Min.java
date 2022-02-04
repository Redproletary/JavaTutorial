package CyclicPath;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x <= min)
                min = x;

        }
        System.out.println(min);

        //while (scanner.hasNextLine()) {
        //String a = scanner.nextLine();
        //}
        //System.out.println("" +  2147483647);
    }
}
