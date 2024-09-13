package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.List;

public class MapOperationExampels {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("java");
        s.add("python");
        s.add("c++");
        s.stream().map(String::length).forEach(System.out::println);
    }
}
