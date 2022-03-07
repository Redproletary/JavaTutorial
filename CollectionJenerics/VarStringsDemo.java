package CollectionJenerics;

import java.util.ArrayList;

public class VarStringsDemo {
    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    } // main(String[]) method
} // VarStringsDemo class
