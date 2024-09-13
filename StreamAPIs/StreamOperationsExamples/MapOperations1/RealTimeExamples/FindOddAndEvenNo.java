package java8.StreamAPIs.StreamOperationsExamples.MapOperations1.RealTimeExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddAndEvenNo {
    public static void main(String[] args) {
      List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8);
      List<Integer>EvenNo=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("even no is:"+EvenNo);
        List<Integer>OddNo=list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("odd no is:"+OddNo);
    }
}
