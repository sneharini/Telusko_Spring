package Streams;

import java.util.Arrays;
import java.util.List;

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



    }

}
