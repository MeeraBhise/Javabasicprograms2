package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingStringToInteger {
    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("40", "65", "32", "12", "22");
        List<Integer> listOfIntegers = list1.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}