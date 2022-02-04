package Types;

public class HugeValue {
    public static void main(String[] args) {
        String bigAmount = "5000";
        String greatAmount = "1000000";

        int hugeAmount = Integer.parseInt (bigAmount) + Integer.parseInt (greatAmount);
        System.out.println(hugeAmount);
    }
}
