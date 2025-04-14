package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,2,3,4,4,5,2,1);

        // skipping first 2 elements

        List<Integer> listAfterSkip = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(listAfterSkip);

    }
}
