package java8.StreamAPIs.StreamOperationsExamples.SelectionOperationsExample4;

import java.util.ArrayList;
import java.util.List;

public class FilterOperationExample {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("java");
        s.add("python");
        s.add("javaa");
        s.add("pythonn");
        s.add("javva");
        s.add("pythooon");
     s.stream().filter((String s1)->s1.length()>1).forEach(System.out::println);
    }
}
