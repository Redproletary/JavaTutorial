package CyclicPath;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = scanner.nextBoolean();
        //if (a = true) {
        //int x = (int) Math.ceil(glass);
        //} else {
        //int x = (int) Math.floor(glass);
        System.out.println(isTrue == true ? (int)Math.ceil(glass) : (int)Math.floor(glass));
    }
}
