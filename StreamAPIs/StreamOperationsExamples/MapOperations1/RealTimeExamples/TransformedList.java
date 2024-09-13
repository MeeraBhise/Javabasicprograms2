package java8.StreamAPIs.StreamOperationsExamples.MapOperations1.RealTimeExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformedList {
    public static void main(String[] args) {
        List<Integer> transformedlist= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer>transformedlist1=transformedlist.stream()
                                       .map(i->i*2)
                                       .collect(Collectors.toList());
        System.out.println(transformedlist1);
    }
}
class PassStudent{
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(34,65,24,56,98,11,16);
        List<Integer>list1=list.stream()
                           .filter(i->i>35)
                          .collect(Collectors.toList());
        System.out.println("passed students:"+list1);
        List<Integer>list2=list.stream().filter(i->i<35)
                .map(j->j+5)
                .collect(Collectors.toList());
        System.out.println("gracestudents:"+list2);
        List<Integer>list3=list.stream().filter(i->i<35).collect(Collectors.toList());
        System.out.println("failed students:"+list3);
    }
}
