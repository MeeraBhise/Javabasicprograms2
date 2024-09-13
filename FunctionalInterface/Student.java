package java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    int id;
    String name;
    double percentage;
    String specialization;

    public Student(int id, String name, double percentage, String specialization) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + percentage + "-" + specialization;
    }

    public static void main(String[] args) {
        List<Student> listofstudents = new ArrayList<Student>();
        listofstudents.add(new Student(11, "John", 81.0, "Mathematics"));
        listofstudents.add(new Student(12, "meera", 82.2, "english"));
        listofstudents.add(new Student(222, "Harsha", 79.5, "History"));
        listofstudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listofstudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listofstudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listofstudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listofstudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listofstudents.add(new Student(888, "Sunil", 86.7, "History"));
        listofstudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listofstudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
        System.out.println("The students are :"+mathematicsPredicate);
        List<Student> mathematicsStudents = new ArrayList<Student>();

        for (Student student : listofstudents) {
            if (mathematicsPredicate.test(student)) {
                mathematicsStudents.add(student);
            }
        }
        System.out.println("students are:"+mathematicsStudents);
    }
}
