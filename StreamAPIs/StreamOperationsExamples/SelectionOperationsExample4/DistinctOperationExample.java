package java8.StreamAPIs.StreamOperationsExamples.SelectionOperationsExample4;

import java.util.ArrayList;
import java.util.List;

public class DistinctOperationExample {
    public static void main(String[] args) {
     List<String> s=new ArrayList<>();
     s.add("ajjab");
     s.add("sdvc");
     s.add("java");
     s.add("java");
     s.stream().distinct().forEach(System.out::println);
    }
}
