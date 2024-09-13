package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Calculate the average age of a list of Person objects using Java streams:
public class StreamExample2 {
   String name;
    int age;
    public StreamExample2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StreamExample2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<StreamExample2> list=new ArrayList<>();
           list.add(new StreamExample2("meera",27));
           list.add(new StreamExample2("ashwini",28));
           list.add(new StreamExample2("snehalata",32));
           double averageAge=list.stream().mapToInt(a->a.getAge()).average().orElse(0);
        System.out.println(averageAge);
    }
}
