package CollectionJenerics;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalDemo {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if(programmingLanguages.get(i).equals("Pascal")) {
                programmingLanguages.remove(i);
                break;
            } // if
        } // for
        System.out.println(programmingLanguages);
    } // main(String[]) method
} // PascalDemo
