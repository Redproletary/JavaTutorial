package ClassMathModularOperation;

public class Increment {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}
