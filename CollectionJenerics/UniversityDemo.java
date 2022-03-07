package CollectionJenerics;

import Classes.Student;

import java.util.ArrayList;

public class UniversityDemo {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    } // main(String[]) method

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        } // for(i)
    } // printStudentNames(ArrayList) method
} // StudentsDemo class
