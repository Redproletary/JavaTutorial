package CollectionJenerics;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseDataDemo {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>(10);

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    } // main(String[]) method

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    } // init() method

    public static void reverse() {
        Collections.reverse(numbers);
    } // reverse() method

    private static void print() {
            System.out.println(numbers.toString());
    } // print() method
} // ReverseDataDemo class
