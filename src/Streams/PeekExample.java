package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//just printing the list
public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,6,7);

        List<Integer> squaredList = numbers.stream()
                .map(n -> n * n)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(squaredList);
    }
}
