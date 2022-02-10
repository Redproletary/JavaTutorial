package Classes;

public class SalaryDemo {
    public static int salary;

    SalaryDemo(int salary) {
        this.salary = salary;
    }

    public static void add(int increase) {
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
