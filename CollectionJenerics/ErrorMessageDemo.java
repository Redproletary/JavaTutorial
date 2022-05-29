package CollectionJenerics;

public class ErrorMessageDemo {

    public static String errorMessage = "не повезло";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        } // try-catch
    } // main(String[]) method

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = 13;
//        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        } // if
        System.out.println("твое счастливое число: " + luckyNumber);
    } // generateLuckyNumber() method
} // ErrorMessageDemo class
