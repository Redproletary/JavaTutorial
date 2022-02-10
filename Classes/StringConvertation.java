package Classes;

public class StringConvertation {
    public static void main(String[] args) {
        String string = "12.84";
        double value = Double.parseDouble(string);
        System.out.println(Math.round(value));
    }
}
