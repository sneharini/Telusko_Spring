package Streams;

// filter out duplicates

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,2,3,4,4,5,2,1);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        // count no of unique elements
        long count = numbers.stream()
                .distinct()
                .count();

        System.out.println(count);
    }
}
