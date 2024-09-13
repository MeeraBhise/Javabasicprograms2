package java8.StreamAPIs.StreamOperationsExamples.StreamCreationOperation4;
import java.util.stream.Stream;
//any type using creating single stream
public class CreatesAStreamOfSingleElementOfTypeT {
    public static void main(String[] args) {
    Stream<student> s= Stream.of( new student());
        System.out.println(s.count());
    }
}
