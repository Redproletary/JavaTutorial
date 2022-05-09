package CollectionJenerics;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class MethodsOfCollections {
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    } // reverse() method

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    } // sort() method

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    } // rotate() method

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    } // shuffle() method

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        reverse(list);
        for (int i : list)
            System.out.println(i);

        sort(list);
        for (int i : list)
            System.out.println(i);

        rotate(list, 3);
        for (int i : list)
            System.out.println(i);

        shuffle(list);
        for (int i : list)
            System.out.println(i);
    } // main(String[]) method
} // class MethodsOfCollections
