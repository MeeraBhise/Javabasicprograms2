package java8.StreamAPIs.StreamOperationsExamples.MapOperations1.RealTimeExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Get the details of highest paid employee in the organization
public class Employee01 {
String name;
String gender;
int id;
double salary;

    public Employee01(String name, String gender, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee01> list1=new ArrayList<>();
        list1.add((new Employee01("mehar","female",101,1120000)) );
        list1.add((new Employee01("rani","female",102,30000)) );
        list1.add((new Employee01("ragu","male",104,50000)) );
        list1.add((new Employee01("mher","male",105,70000)) );

     /*   Double highestPaidEmployeeWrapper=list1.
        stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
*/
        Optional<Employee01> highestPaidEmployeeWrapper=
                list1.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee01::getSalary)));
        Employee01 highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : "+highestPaidEmployee.getId());
        System.out.println("Name : "+highestPaidEmployee.getName());
        System.out.println("Gender : "+highestPaidEmployee.getGender());
        System.out.println("Salary : "+highestPaidEmployee.getSalary());

    }

}
