package io.gprvn.java_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Element-1");
        list.add("Element-2");
        list.add("Element-3");
        list.add("Element-4");
        list.add("Element-5");

        //convert string to lowercase -- an example of non-terminal operation
        list.stream()
                .map(ele -> ele.toLowerCase())
                .forEach(System.out::println);

        list.stream()
                .map(ele -> ele.toUpperCase())
                .forEach(System.out::println);

        System.out.println("===================");
        list.stream()
                .map(String :: toLowerCase)
                .map(String:: toUpperCase)
                .forEach(System.out::println);
    }
}
