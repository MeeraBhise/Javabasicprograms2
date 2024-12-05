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
        stream().collect(Collectors.maxBy(Comparator.comparingDouble(practiseprograms.Employee::getSalary)));
*/
        Optional<Employee01> highestPaidEmployeeWrapper=
                list1.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee01::getSalary)));
        Employee01 highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid practiseprograms.Employee : ");
        System.out.println("==================================");
        System.out.println("ID : "+highestPaidEmployee.getId());
        System.out.println("Name : "+highestPaidEmployee.getName());
        System.out.println("Gender : "+highestPaidEmployee.getGender());
        System.out.println("Salary : "+highestPaidEmployee.getSalary());
    }
}
//Count the number of employees in each department?
/*Map<String, Long> employeeCountByDepartment=
        employeeList.stream().collect(Collectors.groupingBy(practiseprograms.Employee::getDepartment, Collectors.counting()));

Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

for (Entry<String, Long> entry : entrySet)
        {
        System.out.println(entry.getKey()+" : "+entry.getValue());
        }*/
//What is the average salary of each department?
/*Map<String, Double> avgSalaryOfDepartments=
        employeeList.stream().collect(Collectors.groupingBy(practiseprograms.Employee::getDepartment, Collectors.averagingDouble(practiseprograms.Employee::getSalary)));

Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

for (Entry<String, Double> entry : entrySet)
        {
        System.out.

println(entry.getKey()+" : "+entry.

getValue());
        }*/
/*
// get the details of youngest employee
Optional<practiseprograms.Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
        employeeList.stream()
                .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                .min(Comparator.comparingInt(practiseprograms.Employee::getAge));

practiseprograms.Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

System.out.println("Details Of Youngest Male practiseprograms.Employee In Product Development");

System.out.println("----------------------------------------------");

System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());

*/
///who has the most experiance in the organization
/*
Optional<practiseprograms.Employee> seniorMostEmployeeWrapper=
        employeeList.stream().sorted(Comparator.comparingInt(practiseprograms.Employee::getYearOfJoining)).findFirst();

practiseprograms.Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

System.out.println("Senior Most practiseprograms.Employee Details :");

System.out.println("----------------------------");

System.out.println("ID : "+seniorMostEmployee.getId());

        System.out.println("Name : "+seniorMostEmployee.getName());

        System.out.println("Age : "+seniorMostEmployee.getAge());

        System.out.println("Gender : "+seniorMostEmployee.getGender());

        System.out.println("Age : "+seniorMostEmployee.getDepartment());

        System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());

        System.out.println("Salary : "+seniorMostEmployee.getSalary())
*/
