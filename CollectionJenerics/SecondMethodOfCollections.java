package CollectionJenerics;

import java.util.ArrayList;
import java.util.Collections;

public class SecondMethodOfCollections {
    public static Integer min(ArrayList<Integer> list) {
        int minimum = Collections.min(list);
        return minimum;
    } // min(ArrayList<Integer>) method

    public static Integer max(ArrayList<Integer> list) {
        int maximum = Collections.max(list);
        return maximum;
    } // max(ArrayList<Integer>) method

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = Collections.frequency(list, element);
        return frequency;
    } // frequency(ArrayList<Integer> , Integer) method

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int index = Collections.binarySearch(list, key);
        return index;
    } // binarySearch(ArrayList<Integer>, Integer) method

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 4, 3, 4, 5, 6);
        System.out.println(min(list));
        System.out.println(max(list));
        System.out.println(frequency(list, 4));
        System.out.println(binarySearch(list, 3));
    } // main(String[]) method
} // SecondMethodOfCollections class
