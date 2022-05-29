package CollectionJenerics;

public class GetNextMonthDemo {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    } // main(String[]) method

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
        for (int i = 0; i < 12; i++) {
            if (month.ordinal() == 11) {
                return Month.values()[0];
            } else {
                return Month.values()[month.ordinal()+1];
            } // if
        } // for

        return month;
    } // getNextMonth() method
} // GetNextMonthDemo class
