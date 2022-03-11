package CollectionJenerics;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class WordFindingDemo {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) System.out.println("Слово " + word + " есть в множестве");
        else System.out.println("Слова " + word + " нет в множестве");

    } // checkWords(String) method

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    } // main(String[]) method
} // WordFindingDemo class
