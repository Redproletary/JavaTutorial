package FirstProgram;

public class Answer {
    public static void main(String[] args) {
        int x = 14;
        int y = 20;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
