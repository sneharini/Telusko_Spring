package Inheritance;

public class C extends B{
    String address;
    C(){
        System.out.println("Contructor of C");
    }

    C(String name){
        System.out.println("Constructor with 1 param");
    }

    C(String name, int age){
        System.out.println("Constructor with 2 param");
    }

}
