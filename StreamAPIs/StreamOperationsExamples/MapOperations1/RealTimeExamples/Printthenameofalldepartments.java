package java8.StreamAPIs.StreamOperationsExamples.MapOperations1.RealTimeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
// Print the name of all departments in the organization
public class Printthenameofalldepartments {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearofjoining;
    double salary;
    public Printthenameofalldepartments(int id, String name, int age, String gender, String department, int yearofjoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearofjoining = yearofjoining;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getDepartment() {
        return department;
    }
    public int getYearofjoining() {
        return yearofjoining;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "practiseprograms.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearofjoining=" + yearofjoining +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        List<Printthenameofalldepartments> emplist = new ArrayList<Printthenameofalldepartments>();
        emplist.add((new Printthenameofalldepartments(1, "mehar", 07, "female", "computer", 2002, 20000)));
        emplist.add((new Printthenameofalldepartments(2, "mehir", 20, "male", "computer", 2009, 20000)));
        emplist.add((new Printthenameofalldepartments(9, "renuka", 45, "female", "it", 2098, 20000)));
        emplist.add((new Printthenameofalldepartments(6, "mehar", 67, "female", "hr", 2034, 20000)));
        emplist.add((new Printthenameofalldepartments(3, "keshav", 18, "male", "entc", 2013, 20000)));
        emplist.add((new Printthenameofalldepartments(8, "pooja", 89, "female", "computer", 2006, 20000)));
        emplist.add((new Printthenameofalldepartments(31, "raj", 12, "male", "hr", 2019, 20000)));
        emplist.add((new Printthenameofalldepartments(21, "madhavi", 53, "female", "automobile", 2020, 20000)));
        emplist.add((new Printthenameofalldepartments(16, "youraj", 87, "male", "computer", 1999, 20000)));
        emplist.add((new Printthenameofalldepartments(11, "anuja", 23, "male", "electronics", 2021, 20000)));
        emplist.add((new Printthenameofalldepartments(12, "mihir", 27, "male", "computer", 1998, 20000)));
        emplist.add((new Printthenameofalldepartments(10, "miha", 75, "male", "hr", 2010, 20000)));

        emplist.stream().map(Printthenameofalldepartments::getDepartment).distinct().forEach(System.out::println);
        //emplist.stream().map(Printthenameofalldepartments::getDepartment).distinct().forEach(System.out::println);
    }
}
