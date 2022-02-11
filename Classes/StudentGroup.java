package Classes;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public List<String> students;

    public StudentGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(student -> student.equals(excludedStudent));
    } // exclude(String) method

    public static void main(String[] args) {
        StudentGroup universityGroup = new StudentGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    } // main(String[]) method
} // StudentGroup class
