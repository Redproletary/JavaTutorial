package CollectionJenerics;

public class GetTranslationForDayOfWeekDemo {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    } // main(String[]) method

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
            if ("понедельник".equals(ru.toLowerCase())) {
                en = "Monday";
            } else if ("вторник".equals(ru.toLowerCase())) {
                en = "Tuesday";
            } else if ("среда".equals(ru.toLowerCase())) {
                en = "Wednesday";
            } else if ("четверг".equals(ru.toLowerCase())) {
                en = "Thursday";
            } else if ("пятница".equals(ru.toLowerCase())) {
                en = "Friday";
            } else if ("суббота".equals(ru.toLowerCase())) {
                en = "Saturday";
            } else if ("воскресенье".equals(ru.toLowerCase())) {
                en = "Sunday";
            } else {
                en = "Недействительный день недели";
            } // if
        return en;
    } // String getTranslationForDayOfWeek(String) method
}// GetTranslationForDayOfWeekDemo
