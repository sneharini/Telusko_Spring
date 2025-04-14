package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("sneha", "babu", "harini");

        // transforms to uppercase
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        // using method reference
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // get name lenght

        List<Integer> lenghtOfNames = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lenghtOfNames);


    }
}
