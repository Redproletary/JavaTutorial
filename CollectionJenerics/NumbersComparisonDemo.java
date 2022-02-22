package CollectionJenerics;

import java.util.Objects;

public class NumbersComparisonDemo {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    } // main(String[]) method
} // NumbersComparisonDemo class
