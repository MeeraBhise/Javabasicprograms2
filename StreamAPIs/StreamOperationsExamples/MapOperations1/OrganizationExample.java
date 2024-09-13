package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class OrganizationExample {
    int id;
    String name;
    String gender;
    double salary;

    public OrganizationExample(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "OrganizationExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
     List<OrganizationExample> list1=new ArrayList<>();
     list1.add(new OrganizationExample(9,"meera","female",2000));
        list1.add(new OrganizationExample(3,"raj","male",1000));
        list1.add(new OrganizationExample(6,"anu","female",5000));
        list1.add(new OrganizationExample(1,"soham","male",3000));
        list1.add(new OrganizationExample(2,"kusum","female",7000));

        Map<Integer,String> lis=list1.stream().
                collect(Collectors.toMap(a->a.getId(),b->b.getGender()));
        System.out.println("there is "+list1.stream().count() +"no of employees");

    }
}
