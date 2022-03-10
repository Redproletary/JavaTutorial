package FirstProgram;

public class AlarmTestDemo {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true & vacation == true) return false;
        if (employed == false & vacation == true) return false;
        if (employed == false & vacation == false) return false;
        if (employed == true & vacation == false) return true;

        return employed;
    } // setAlarm(boolean, boolean)

    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(true, false));


    } // main(String[]) method
} // AlarmTestDemo class
