package CollectionJenerics;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } // for(i)
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        } // for (s)
    } // main(String[]) method

    public static HashSet<String> arrayToHashSet(String[] strings) {

        Set<String> arrayToHashSet = new HashSet<String>(List.of(strings));
        return (HashSet<String>) arrayToHashSet;
    } // HashSet<String> arrayToHashSet(String[]) method
} // HashSetDemo class
