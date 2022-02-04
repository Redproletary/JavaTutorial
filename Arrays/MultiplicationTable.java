package Arrays;

public class MultiplicationTable {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        MULTIPLICATION_TABLE[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MULTIPLICATION_TABLE[1] = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        MULTIPLICATION_TABLE[2] = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        MULTIPLICATION_TABLE[3] = new int[]{4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
        MULTIPLICATION_TABLE[4] = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        MULTIPLICATION_TABLE[5] = new int[]{6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        MULTIPLICATION_TABLE[6] = new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        MULTIPLICATION_TABLE[7] = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        MULTIPLICATION_TABLE[8] = new int[]{9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        MULTIPLICATION_TABLE[9] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
