package FirstProgram;

public class SheepCountingDemo {
    public static String countingSheep(int num) {
            if(num == 0) return ("");
            else if (num == 1) return ("1 sheep...");
            else if (num == 2) return ("1 sheep...2 sheep...");
            else if (num == 3) return ("1 sheep...2 sheep...3 sheep...");


        return String.valueOf(num);
    } // countingSheep(int) method

    public static void main(String[] args) {
        System.out.println(countingSheep(0));
        System.out.println(countingSheep(1));
        System.out.println(countingSheep(2));
        System.out.println(countingSheep(3));
    } // main(String[]) method
} // SheepCountingDemo class
