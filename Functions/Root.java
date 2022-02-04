package Functions;

public class Root {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String a = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double b = Math.sqrt(element);
            System.out.println(a + element + " равен " + b);
        }
    }
}
