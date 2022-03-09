package Arrays;

public class Map {
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        } // for(i)
        return arr;
    } // map(int[]) method
} // Map class