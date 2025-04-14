package Streams;

import java.util.*;
import java.util.stream.DoubleStream;

public class Streams {
    public static void main(String[] args) {


        /*** FILTERS ***/

        // ways to create stream
        List<Integer> numbers = Arrays.asList(1,4,2,3,6,2,7,2);
//        Stream<Integer> stream = numbers.stream();
//
//        Integer[] arr = {12,33,2,4};
//        Stream<Integer> stream1 = Stream.of(arr);

        //Stream.Builder<Integer> stream2 = Stream.builder();

        // Q. Extract all the even numbers from the list

        List<Integer> evenNumber = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                evenNumber.add(numbers.get(i));
            }
        }
        System.out.println(evenNumber);

        // using stream
        // input - predicate
        // 1. we can create class to implement predicate interface
        // 2. creating Anonymous class
        // 3. using Lambdas

        System.out.println("Streams with filter : " + numbers.stream().filter((num) -> num % 2 == 0).toList());

        /*
        1. List is converted into a stream of numbers
        2. Stream will loop over the elements of the list.
        3. Every element will be passed to the filter as an input.
        4. If the condition of filter method return true, then that element will be taken in the output.
        5. Else that element is ignored.
         */


//        public void frequencySort(int[] nums) {
//            Map<Integer, Integer> map = new HashMap<>();
//
//            Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0)+1));
//
//           // return Arrays.stream(nums)
////                    .boxed()
////                    .sorted((a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b))
////                    .mapToInt(n -> n)
////                    .toArray();
//        }









    }

   
}
