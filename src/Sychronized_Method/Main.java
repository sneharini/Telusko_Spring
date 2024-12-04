package Sychronized_Method;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        // join helps to wait the main thread, till t1 and t2 completes its work

//        t1.join();
//        t2.join();

        // main thread --> print statement will execute once both the threads completes its work
        System.out.println(count.getValue());



    }
}
