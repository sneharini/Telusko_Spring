package PrivateConstructor;



public class pConstructor {
    static pConstructor instance;

    private pConstructor(){
        System.out.println("Instance created");
    }


    public static pConstructor getInstance() {
        if(instance == null){
            instance = new pConstructor();
        }
        return instance;
    }
}


/*
* only one instance of a class should exist.
* A private constructor ensures that the class cannot be instantiated from outside,
* and a static method (like getInstance) provides controlled access to the single instance.*/