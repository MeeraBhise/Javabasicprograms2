package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String Address;
    String name;
    double salary;
    public Employee(int id, String address, String name, double salary) {
        this.id = id;
        Address = address;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getAddress() {
        return Address;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
    List<Employee> datalist1=new ArrayList<>();
        datalist1.add((new Employee (1,"Pune","mehar",89000)));
        datalist1.add((new Employee (9,"latur","mayra",90000)));
        datalist1.add((new Employee (3,"osmanabad","meera",8000)));
        datalist1.add((new Employee (6,"nanded","ranjeet",20000)));
        datalist1.add((new Employee (4,"mumbai","bajrang",34000)));
        datalist1.add((new Employee (2,"pusad","raj",65000)));
        datalist1.add((new Employee (8,"parbhani","ajit",96000)));

        List<Double> map=datalist1.stream().map(e->e.getSalary()).distinct().collect(Collectors.toList());
        System.out.println(map);



     //   Map<Double, String> map1 = dataList.stream().
       //   collect(Collectors.toMap(data11111 -> data11111.getSalary(), data2222 -> data2222.getName()));

    }
}
