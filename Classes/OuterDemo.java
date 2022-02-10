package Classes;

public class OuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested Nested = new Outer.Nested();

    }
}
