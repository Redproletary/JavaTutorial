package CyclicPath;

public class EvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
