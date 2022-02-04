package Functions;

public class SuperCubeCalculator {
    public static void main(String[] args) {

    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long a) {
        // b = a*a*a;
        //return (a*a*a)*(a*a*a)*(a*a*a);
        return cube(cube(a));
    }
}
