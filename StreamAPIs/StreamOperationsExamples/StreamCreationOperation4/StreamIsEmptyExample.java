package java8.StreamAPIs.StreamOperationsExamples.StreamCreationOperation4;

import java.util.stream.Stream;

public class StreamIsEmptyExample {
    public static void main(String[] args) {
       // Stream<student> s=Stream.empty();
        Stream<String> s=Stream.empty();
        {
            System.out.println(s.count());
        }
    }
}
