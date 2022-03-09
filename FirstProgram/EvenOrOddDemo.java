package FirstProgram;

public class EvenOrOddDemo {
        public static String even_or_odd(int number) {
            if (Math.abs(number) % 2 == 0) return "Even";
            if (Math.abs(number) % 2 == 1) return "Odd";
            return String.valueOf(number % 2);
        } // getCount(String) method

    public static void main(String[] args) {
        System.out.println(even_or_odd(-1));
    }
} // EvenOrOddDemo class
