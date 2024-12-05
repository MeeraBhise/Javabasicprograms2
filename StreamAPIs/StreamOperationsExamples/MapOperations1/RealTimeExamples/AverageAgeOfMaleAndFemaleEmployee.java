package java8.StreamAPIs.StreamOperationsExamples.MapOperations1.RealTimeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAgeOfMaleAndFemaleEmployee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearofjoining;
    double salary;
    public AverageAgeOfMaleAndFemaleEmployee(int id, String name, int age, String gender, String department, int yearofjoining, double salary) {
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
        List<AverageAgeOfMaleAndFemaleEmployee> emplist = new ArrayList<AverageAgeOfMaleAndFemaleEmployee>();
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(1, "mehar", 07, "female", "computer", 2002, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(2, "mehir", 20, "male", "computer", 2009, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(9, "renuka", 45, "female", "it", 2098, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(6, "mehar", 67, "female", "hr", 2034, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(3, "keshav", 18, "male", "entc", 2013, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(8, "pooja", 89, "female", "computer", 2006, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(31, "raj", 12, "male", "hr", 2019, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(21, "madhavi", 53, "female", "automobile", 2020, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(16, "youraj", 87, "male", "computer", 1999, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(11, "anuja", 23, "male", "electronics", 2021, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(12, "mihir", 27, "male", "computer", 1998, 20000)));
        emplist.add((new AverageAgeOfMaleAndFemaleEmployee(10, "miha", 75, "male", "hr", 2010, 20000)));

    }
}
// Count the number of employees in each department?
/*
Map<String, Long> employeeCountByDepartment=
        employeeList.stream().collect(Collectors.groupingBy(practiseprograms.Employee::getDepartment, Collectors.counting()));

Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

for (Entry<String, Long> entry : entrySet)
        {
        System.out.println(entry.getKey()+" : "+entry.getValue());
        }
*/
//: Get the names of all employees who have joined after 2015?
     /*   employeeList.stream()
            .filter(e -> e.getYearOfJoining() > 2015)
        .map(practiseprograms.Employee::getName)
            .forEach(System.out::println);*/