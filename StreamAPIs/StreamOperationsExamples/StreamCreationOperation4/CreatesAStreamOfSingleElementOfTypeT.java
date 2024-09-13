package java8.StreamAPIs.StreamOperationsExamples.StreamCreationOperation4;
import java.util.stream.Stream;
//any type using creating single stream
/*
public class CreatesAStreamOfSingleElementOfTypeT {
    public static void main(String[] args) {
    Stream<student> s= Stream.of( new student());
        System.out.println(s.count());
    }
}
*/
class test1{
    public static void main(String[] args) {
        Stream<test1>s2=Stream.of( new test1() );
        System.out.println(s2.count());
    }
}
 class test2
 {
     public static void main(String[] args) {
         Stream<test2> s2=Stream.of(new test2());
         System.out.println(s2.count());
     }
 }

