package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.List;

public class MapToIntExample {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(6);
        s.add(3);
        s.add(61);
      s.stream().mapToInt(Integer::intValue).forEach(System.out::println);
    }
}
