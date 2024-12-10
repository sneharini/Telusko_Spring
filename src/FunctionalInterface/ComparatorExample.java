package FunctionalInterface;

import java.sql.SQLOutput;
import java.util.*;

public class ComparatorExample {
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
        Car car1 = new Car("SUV", 200, 30000);
        Car car2 = new Car("Maruthi", 100, 3000);
        Car car3 = new Car("jeep", 500, 40000);
        Car car4 = new Car("Honda", 220, 30900);

        List<Car> cars = Arrays.asList(car1,car2,car3,car4);
//        Comparator<Car> comparator = new Comparator<Car>() {
//            @Override
//            public int compare(Car c1, Car c2) {
//                return c1.speed - c2.speed;
//            }
//        };

        //using lambda
        //Comparator<Car> comparator = (c1, c2) -> c1.speed - c2.speed;

        // instead of passing comparator reference, we can directly pass the implementation
        Collections.sort(cars, (c1, c2) -> c1.speed - c2.speed);

        System.out.println(cars);
    }
}
