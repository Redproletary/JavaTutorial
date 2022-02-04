package CyclicPath;

import java.util.Scanner;

public class WhileTenTimes {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        int value = 0;
        while (value<10){
            System.out.println(name+text);
            value = value+1;
        }
    }
}
