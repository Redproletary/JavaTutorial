package DataTypes;

public class Infinite {
    public static void main(String[] args) {
        div(0.0 , 100.0);
        div(0.0 , -100.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
