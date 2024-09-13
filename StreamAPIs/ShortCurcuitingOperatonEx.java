package java8.StreamAPIs;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ShortCurcuitingOperatonEx {
    public static void main(String[] args) {
        List<Integer> g =new ArrayList<>();
        g.add(90);
        g.add(20);
        g.add(10);
        g.add(30);
        g.add(50);
        g.add(60);
        Stream<Integer> stream=g.stream();
        System.out.println(stream.findAny());
    }
}
