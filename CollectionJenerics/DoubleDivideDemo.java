package CollectionJenerics;

import static java.lang.Double.NaN;

public class DoubleDivideDemo {
    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    } // main(String[]) method

    public static void divide(double a, double b) {
        System.out.println(a / b);
    } // divide(double, double) method
} //   DoubleDivideDemo class
