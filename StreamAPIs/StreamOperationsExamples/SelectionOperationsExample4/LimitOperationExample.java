package java8.StreamAPIs.StreamOperationsExamples.SelectionOperationsExample4;

import java.util.ArrayList;
import java.util.List;

public class LimitOperationExample {
    public static void main(String[] args) {
     List<String > s=new ArrayList<>();
     s.add("java");
     s.add("java123");
     s.add("shcb");
     s.add("vvks");
       s.stream().limit(2).forEach(System.out::println);
    }
}