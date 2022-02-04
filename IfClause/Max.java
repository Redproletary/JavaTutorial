package IfClause;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int c = numberA > numberB ? numberA : numberB;
        System.out.println(c);
    }
}
