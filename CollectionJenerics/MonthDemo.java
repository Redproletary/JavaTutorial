package CollectionJenerics;

public enum MonthDemo {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final MonthDemo[] MonthsArray = {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER
    };

    public static MonthDemo[] getWinterMonths() {
        for (int i = 11; i < 12; i++) {
            System.out.println(MonthsArray[i]);
        } // for
        for (int i = 0; i < 2; i++) {
                System.out.println(MonthsArray[i]);
        } // for
        return MonthsArray;
    } // getWinterMonths() method

    public static MonthDemo[] getSpringMonths() {
        for (int i = 2; i < 5; i++) {
            System.out.println(MonthsArray[i]);
        }  // for
        return MonthsArray;
    } // getSpringMonths() method


    public static MonthDemo[] getSummerMonths() {
        for (int i = 5; i < 8; i++) {
            System.out.println(MonthsArray[i]);
        } // for
        return MonthsArray;
    } // getSummerMonths() method

    public static MonthDemo[] getAutumnMonths() {
        for (int i = 8; i < 11; i++) {
            System.out.println(MonthsArray[i]);
        } // for
        return MonthsArray;
    } // getAutumnMonths() method
} // MonthDemo enum

class GetMonths {
    public static void main(String[] args) {
        MonthDemo.getWinterMonths();
        MonthDemo.getSpringMonths();
        MonthDemo.getSummerMonths();
        MonthDemo.getAutumnMonths();

    } // main(String[]) method
} // GetMonths class
