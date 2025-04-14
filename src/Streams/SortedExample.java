package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,2,3,4,4,5,2,1);
         // sorting in ascending
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("------------------");
        // sorting in descending
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        // sort based on the length of the words

        List<String> names = Arrays.asList("sneha","dillibabu","devan","lek");

        List<String> sortedWordsByLength = names.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();

        sortedWordsByLength.forEach(System.out::println);
    }
}
