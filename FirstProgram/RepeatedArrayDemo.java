package FirstProgram;



public class RepeatedArrayDemo {
    public static String repeat(String string, long n){

        for (int i = 1; i < n; i++) {
            System.out.print(string);
        } // for(i)

        return string;
    } // repeat(String) method

    public static void main(String[] args) {
        System.out.println(repeat("a",5));
        System.out.println(repeat("Na",16));
        System.out.println(repeat("Wub ",6));
    } // main(String[]) method
} // RepeatedArrayDemo class
