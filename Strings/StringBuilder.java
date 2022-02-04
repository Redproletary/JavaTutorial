package Strings;

public class StringBuilder {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишите тут ваш код
        StringBuilder builder1 = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            builder1.append(strings[i]);
        }
        return new StringBuilder(builder1.toString());
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишите тут ваш код
        StringBuilder builder2 = new StringBuilder(string);
        builder2.replace(start, end, str);
        return new StringBuilder(builder2.toString());
    }
}
