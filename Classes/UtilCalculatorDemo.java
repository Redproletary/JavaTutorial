package Classes;

public class UtilCalculatorDemo {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    static class Calculator {
        public static void add(int a, int b) {

            System.out.println(a + " + " + b + EQUAL + (a + b));
        } // add(int, int) method

        public static void subtract(int a, int b) {

            System.out.println(a + " - " + b + EQUAL + (a - b));
        } // subtract(int, int) method

        public static void multiply(int a, int b) {

            System.out.println(a + " * " + b + EQUAL + (a * b));
        } // multiply(int, int) method

        public static void divide(int a, int b) {

            System.out.println(a + " / " + b + EQUAL + (a / b));
        } // divide(int, int) method

    } // Calculator class

} // UtilCalculatorDemo class
