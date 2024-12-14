package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter{
    static class Car{
        String name;
        int speed;
        int rate;

        Car(String name, int speed, int rate){
            this.name = name;
            this.speed = speed;
            this.rate = rate;
        }
        public String toString(){
            return " Name : "+ this.name +"," + "speed : "+ this.speed  ;
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("SUV", 200, 30090);
        Car car2 = new Car("maruti", 400, 90000);
        Car car3 = new Car("honda", 300, 770000);
        Car car4 = new Car("jeep", 900, 990000);

        // filter all the cars with price greater than 900000
        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        System.out.println(cars.stream().filter((carPrice) -> carPrice.rate > 90000).toList());

        // MAP
        //for every car, extract the price
        System.out.println(cars.stream().map((car) -> {return car.rate;}).toList());


        Stream<Integer> stream = Stream.of(2, 4, 6, 8, 10, 3, 17, 19);
        // filter out odd elements
        System.out.println( stream.filter((value) -> value % 2 != 0).collect(Collectors.toList()));

        //
        // Please use the allMatch method to confirm if all numbers in the stream are even.
        //System.out.println(stream.allMatch((num) -> num % 2 == 0)); //false

        // sort in descending order
        List<String> animals = Arrays.asList("cat","dog","animal-x","elephant","mouse");
        System.out.println(animals.stream().sorted((a,b) -> b.length() - a.length()).collect(Collectors.toList()));


        // count the number of words that has lenght greater than 5
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        long count = words.stream()
                .filter(w -> w.length() > 5)
                .count();
        System.out.println(count);

        // check if any word starts with b
        boolean anyMatch = words.stream().anyMatch(w -> w.startsWith("b"));
        System.out.println(anyMatch);

        // calculate sum of squares of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum); // reduce method accumulate the integer with sum
        System.out.println("Sum: " + sum);


        //sort a list of strings in descending order according to length
        /*
        Comparator comparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        Comparator comparator = (s1, s2) -> s2.length() - s1.length();

        Comparator comparator = Comparator.comparingInt(String::length).reversed();

        */


    }

}
