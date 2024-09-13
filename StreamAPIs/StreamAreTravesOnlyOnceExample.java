package java8.StreamAPIs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAreTravesOnlyOnceExample {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("JAwqVA1");
        li.add("jersxxava2");
        li.add("JAVxx A21");
        li.add("ja va12");
        li.add("JAVAs1");
        li.add("javasx2");
        li.add("JAVAfg1");
        li.add("javaetr2");
        Stream<String> stream = li.stream();
      stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
