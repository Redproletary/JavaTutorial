package Classes;

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            } // if
        } // for
        students[i] = student;
    } // addStudent(String) method

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            } // if
        } // for
    } // printStudents() method

    public static void main(String[] args) {
        University u = new University();
        u.addStudent("Максим Федоренко");
        u.addStudent("Олег Кесарчук");
        u.printStudents();
    }
} // University class
