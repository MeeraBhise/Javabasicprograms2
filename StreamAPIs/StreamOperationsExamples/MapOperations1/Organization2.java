package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Organization2 {
    int id;
    String name;
    String departmentname;

    public Organization2(int id, String name, String departmentname) {
        this.id = id;
        this.name = name;
        this.departmentname = departmentname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    @Override
    public String toString() {
        return "Organization2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public static void main(String[] args) {
     List<Organization2>li=new ArrayList<>();
     li.add(new Organization2(101,"raju","civil"));
        li.add(new Organization2(108,"viju","mechanical"));
        li.add(new Organization2(102,"saju","automobile"));
        li.add(new Organization2(105,"anju","computer"));
        li.add(new Organization2(106,"madhu","entc"));
        li.add(new Organization2(103,"raj","mechanical"));
        li.add(new Organization2(109,"mehar","civil"));

        Set<String> list= (Set<String>) li.stream().map(e->e.getDepartmentname()).distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
