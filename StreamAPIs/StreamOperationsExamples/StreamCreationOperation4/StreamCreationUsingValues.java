package java8.StreamAPIs.StreamOperationsExamples.StreamCreationOperation4;

import java.util.stream.Stream;

public class StreamCreationUsingValues {
    public static void main(String[] args) {
        Stream<Integer>s=Stream.of(1,2,3,4,5);
        System.out.println(s.count());
    }
}
