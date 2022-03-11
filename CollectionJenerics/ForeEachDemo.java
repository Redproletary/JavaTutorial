package CollectionJenerics;

import java.util.*;

public class ForeEachDemo {
    public static void printList(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        } // for-each
    } // printList(ArrayList<String>) method

    public static void printHashSet(HashSet<String> words) {
        for (String word : words) {
            System.out.println(word);
        } // for-each
    } // printHashSet(HashSet<String>) method

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    } // main(String[]) method
} // ForeEachDemo class
