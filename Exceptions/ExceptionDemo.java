package Exceptions;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    } // main(String[]) method

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        } // if
        System.out.println("твое счастливое число: " + luckyNumber);
    } // generateLuckyNumber() method
} // ExceptionDemo class
