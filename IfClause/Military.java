package IfClause;

import java.util.Scanner;

public class Military {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner str = new Scanner(System.in);
        String name = str.nextLine();

        Scanner num = new Scanner(System.in);
        int age = num.nextInt();

        if (age > 17 && age < 29) {
            System.out.println(name + ", явитесь в военкомат");
        }
    }
}
