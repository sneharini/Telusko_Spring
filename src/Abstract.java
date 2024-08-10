public class Abstract {
    public static void main(String[] args) {
        //Car obj  = new Car(); // cannot create an obj for abstract class
        Car obj =  new WagonR(); // can create an obj of the reference abstract class
        obj.drive();
        obj.playMusic();
    }
}

abstract class Car {

    //not implementing this drive
    public abstract void drive(); // declaring the method

    //implementing playMusic
    public void playMusic(){
        System.out.println("Play music");
    }
}

class WagonR extends Car{  //concrete class

    //since wagonR extending abstract class, it is compulsory to define all the methods in abstract class
    public void drive(){
        System.out.println("Driving");
    }
}
