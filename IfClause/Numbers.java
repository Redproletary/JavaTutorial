package IfClause;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (a == b && a == c && b == c)
            System.out.println(a+ " " +b+ " " +c);
        else if (a != b && a == c)
            System.out.println(a+ " " +c);
        else if (a != c && a != b && b == c)
            System.out.println(b+ " " +c);
        else if (a == b)
            System.out.println(a+ " " +b);
    }
}
