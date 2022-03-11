package CollectionJenerics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class OutputHashSetElement {
    public static void print(HashSet<String> words) {

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        } // while

    } // print(HashSet<String>) method

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    } // main(String[]) method
} // OutputHashSetElement class
