package Streams;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams {
    public static void main(String[] args) {
        // Primitive array
        int[] primitiveArray = {1,2,3,4};

        IntStream intStream = Arrays.stream(primitiveArray);
        intStream.forEach(System.out::println);


        // Object array
        Integer[] objectArray = {1,2,3,4};
        Stream<Integer> integerStream = Stream.of(objectArray);
        integerStream.forEach(System.out::println);


        // list to Stream
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        integerList.stream()
                .forEach(System.out::println);
    }
}
