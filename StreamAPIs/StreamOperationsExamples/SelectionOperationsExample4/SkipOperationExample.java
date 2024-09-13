package java8.StreamAPIs.StreamOperationsExamples.SelectionOperationsExample4;

import java.util.ArrayList;
import java.util.List;

public class SkipOperationExample {
    public static void main(String[] args) {
     List<String> s=new ArrayList<>();
     s.add("java23");
     s.add("sbbs");
     s.add("sbvd");
    s.stream().skip(3).forEach(System.out::println);
    }
}
