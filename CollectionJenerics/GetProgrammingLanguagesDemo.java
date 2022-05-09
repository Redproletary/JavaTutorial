package CollectionJenerics;

import java.util.HashMap;

public class GetProgrammingLanguagesDemo {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    } // main(String[]) method

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> programmingLanguages = new HashMap<>();

        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");

        return programmingLanguages;
    } // getProgrammingLanguages() method
} // GetProgrammingLanguagesDemo class
