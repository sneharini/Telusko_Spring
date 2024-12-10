package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // way1 -  create a class which implements the interface
        BiPredicate<String, Integer> biPredicate = new BiPredicateImp();
        System.out.println(biPredicate.test("Sneha",4));

        // way2 - Anonymous class
        BiPredicate<String, Integer> biPredicate2 = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return s.length() > integer;
            }
        };
        System.out.println(biPredicate2.test("Harini", 10));

        // way3 - Lambdas
        // () -> input parameters
        // {} -> implementations
        BiPredicate<String, Integer> biPredicate3 = (str, integer) -> str.length() > integer;
        System.out.println(biPredicate3.test("netflix" , 5));
    }
}
