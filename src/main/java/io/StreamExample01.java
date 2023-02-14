package main.java.io;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Element-1");
        list.add("Element-2");
        list.add("Element-3");
        list.add("Element-4");
        list.add("Element-5");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);

    }
}
