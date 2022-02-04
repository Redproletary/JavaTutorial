package CyclicPath;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = scanner.nextInt();
        do {
            //for (int i = 1; i < number; i++) {
            System.out.println(word);
            number--;
            //}

        } while (number > 0 && number < 4);

        //System.out.println(word);
    }
}
