package java8.FunctionalInterface.PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Predicate – Tests an object
public class Example1 {
    List<Student> mathematicsStudents = new ArrayList<Student>();
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
        List<Student> mathematicsStudents = new ArrayList<Student>();
        for (Student student : listOfStudents) {
            if (mathematicsPredicate.test(student)) {
                mathematicsStudents.add(student);
                System.out.println(mathematicsStudents);
                System.out.println(mathematicsPredicate);
            }
        }
    }
}

