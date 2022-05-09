package CollectionJenerics;

import java.util.HashMap;

public class StudentsWithGradesDemo {
        public static HashMap<String, Double> grades = new HashMap<>();

        public static void main(String[] args) {
            addStudents();
            System.out.println(grades);
        } // main(String[]) method

        public static void addStudents() {
            grades.put("Ivanov Ivan", 4.6);
            grades.put("Petrov Peter", 4.2);
            grades.put("Sirotkin Aleksandr", 3.6);
            grades.put("Lisichkina Svetlana", 4.9);
            grades.put("Sidorov Vasiliy", 5.0);
        } // addStudents() method
} // StudentsWithGradesDemo class
