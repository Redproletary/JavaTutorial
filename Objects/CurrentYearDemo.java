package Objects;

import java.util.Calendar;


public class CurrentYearDemo {

    private int currentYear;

    public CurrentYearDemo() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    } // Solution() constructor

    public int getCurrentYear() {
        return currentYear;
    } // getCurrentYear() method

    public static void main(String[] args) {
        CurrentYearDemo solution = new CurrentYearDemo();
        System.out.println(solution.getCurrentYear());
    } // main(String[]) method
} // CurrentYearDemo class