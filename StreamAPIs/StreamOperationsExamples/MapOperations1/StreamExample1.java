package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.*;
import java.util.stream.Stream;

/*
public class StreamExample1 {
    public static void main(String[] args) {
    List<String> list= Arrays.asList("meera","mehar","java","python","c++","javapython");
        Optional<String>longstring=list.stream(). max(Comparator.comparingInt(String::length));
        System.out.println("long string is:"+longstring);
    }
}
*//*
class StreamExample1{
    String name;
    public StreamExample1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "StreamExample1{" +
                "name='" + name + '\'' +
                '}';
    }*/

 /*   public static void main(String[] args) {
     List<String> list=new ArrayList<>();
     list.add("mehar");
     list.add("bhise");
     list.add("pythonn");
     list.add("c++");
     Optional<String>list1=list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(list1);
    }
}
*/

public class StreamExample1
{
    public static void main(String[] args) {
        List<String>list=Arrays.asList("string","integer","character","boolean");
        Optional<String>list1=list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(list1);
    }
}








