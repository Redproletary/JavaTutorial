package IfClause;

import java.util.Scanner;

public class WarmOrCold {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner num = new Scanner(System.in);
        int temperature;
        temperature = num.nextInt();

            if (temperature  < 0) {
                System.out.println("на улице холодно");
            } else {
                System.out.println("на улице тепло");
            }
        }
}
