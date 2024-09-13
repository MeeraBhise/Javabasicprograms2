package java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Students {
    int id;
    String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Students> liststudent = new ArrayList<Students>();
        liststudent.add(new Students(101, "z"));
        liststudent.add(new Students(102, "h"));
        liststudent.add(new Students(103, "s"));
        liststudent.add(new Students(104, "b"));


        System.out.println(liststudent);
//         liststudent.stream().sorted().forEach(System.out::println);
        List<Students> l = liststudent.stream().filter(a -> a.getId()>103).collect(Collectors.toList());
        System.out.println(l);

    }
}