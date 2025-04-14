package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Reduce to one element
public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Sum of all the elements

        int sum = list.stream()
                .reduce(0,(a,b) -> a+b);

        System.out.println(sum);

        // find the longest string

        List<String> names = Arrays.asList("Sneha", "Nova", "Loganathan","kdhhfkdkfjdfijghjggf");
        String longest = names.stream()
                .reduce("", (a,b) -> a.length() > b.length() ? a : b);

        System.out.println(longest);

        // Concatenate all the string
        List<String> letters = Arrays.asList("S", "n", "e", "h", "a");
        String combined = letters.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(combined);  // Sneha

        // finding the max value
        List<Integer> array = Arrays.asList(32,4,64,2332,45453,33,89);

        int max = array.stream()
                .reduce(0, (a,b) -> a > b ? a : b);

        System.out.println(max);


    }
}
