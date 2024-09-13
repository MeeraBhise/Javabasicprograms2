package java8.StreamAPIs.StreamOperationsExamples.MapOperations1.RealTimeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
// What is the average age of male and female employees?
public class OrganizationExample01 {
    String name;
    int id;
    String departmentname;
    double salary;
    int age;
    String gender;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    public String getgender()
    {
        return gender;
    }
    @Override
    public String toString() {
        return "OrganizationExample01{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", departmentname='" + departmentname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ",gender="+gender+
                '}';
    }
    public OrganizationExample01(String name, int id, String departmentname, double salary, int age,String gender) {
        this.name = name;
        this.id = id;
        this.departmentname = departmentname;
        this.salary = salary;
        this.age = age;
        this.gender=gender;
    }
    public static void main(String[] args) {
        List<OrganizationExample01> list1=new ArrayList<>();
        list1.add((new OrganizationExample01("sunita",98,"computer",200000,98,"female")));
        list1.add((new OrganizationExample01("vasant",98,"entc",200000,98,"male")));
        list1.add((new OrganizationExample01("lata",02,"computer",200000,29,"female")));
        list1.add((new OrganizationExample01("vyankat",8,"mechanical",200000,49,"male")));
        list1.add((new OrganizationExample01("dyaneshvary",29,"computer",200000,19,"female")));
        list1.add((new OrganizationExample01("mhadev",93,"automobile",200000,39,"male")));
        list1.add((new OrganizationExample01("nita",38,"mech",200000,79,"female")));

        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                list1.stream().collect(groupingBy(OrganizationExample01::getgender, Collectors.averagingInt(OrganizationExample01::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);
    }
}