package CollectionJenerics;

import java.util.ArrayList;

public class AccountingStaffDemo {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
        paySalary("Гунигерд");
        System.out.println(waitingEmployees.toString());
        System.out.println(alreadyGotSalaryEmployees.toString());
    } // initEmployees() method

    public static void main(String[] args) {initEmployees();
        } // main(String[])

    public static void paySalary(String name) {
            if (waitingEmployees.contains(name) & name != null) {
                alreadyGotSalaryEmployees.add(name);
        } // if

        for (int i = 0; i < waitingEmployees.size(); i++) {
            if (waitingEmployees.contains(name) & name != null) {
                waitingEmployees.set((waitingEmployees.indexOf(name)), null);
            } // if
        } // for

    } // paySalary(String) method
} // AccountingStaffDemo class

