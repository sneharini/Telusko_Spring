package Inheritance;

public class D extends  C{
    String batch;


    D(){
        super("Sneha");  // to call the parameterized constructor of parent class
        System.out.println("Contructor of D");
    }

    // super --  call the parameterized constructor of parent class (immediate parent class)
}
