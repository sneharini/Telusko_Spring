package Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Pair p = new Pair();
//        p.first = "Scaler";
//        p.second = 100;
//
//
//        String city = p.second;// error - since second has integer but expected string- it gives RTE

        Pair<String, Integer> p = new Pair<>();
        p.first = "India";
        p.second = 2000;

        Pair<Integer, Double> p1 = new Pair<>();


        /*
        Generics introduced in java 5
        Java is a Backward Compatible language -- it doesn't affect the already existing code
                                                  even though new features were introduced
                                                  
         */
        List<Animal> animal = new ArrayList<>();
        List<Dog> dog = new ArrayList<>();

        doSomething(animal);
        doSomething(dog);  // error

        // List<Animal> animals = new ArrayList<Dog>();  -> not possible
        // List<? extends Animal> animals = new ArrayList<Dog>(); -> possible

    }
    private static void doSomething(List<? extends Animal> animals){
        System.out.println("Inside the dosomething");
    }

    // ? extends Animal  --> Animal + any child class of Animal
    // ? super Animal    --> Animal + parent class of Animal

}
