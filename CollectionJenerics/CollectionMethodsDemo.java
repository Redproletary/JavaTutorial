package CollectionJenerics;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethodsDemo {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if(destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        Collections.copy(destination, source);
    } // copy(ArrayList<String>, ArrayList<String>)

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    } // addAll(ArrayList<String>) method

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {

        Collections.replaceAll(list, oldValue, newValue);
    } // replaceAll(ArrayList<String>, String, String) method
} // CollectionMethodsDemo class
