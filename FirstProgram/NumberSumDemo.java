package FirstProgram;

public class NumberSumDemo {
    public static int summation(int n) {
             if(n < 1) return 0;
        else return (n + summation(n-1));
    }

    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(2));
        System.out.println(summation(8));
    }
} // NumberSumDemo class
