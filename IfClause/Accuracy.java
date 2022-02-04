package IfClause;

import java.util.Scanner;

public class Accuracy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double a = console.nextDouble();
        Double b = console.nextDouble();
        if (Math.abs(b - a) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
