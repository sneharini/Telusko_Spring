package Streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("sneha", "babu"),
                Arrays.asList("lekha", "deva"),
                Arrays.asList("surya", "jo")
        );

        listOfLists.stream()
                .flatMap(list -> list.stream())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
