package Sychronized_Keyword;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(adder);
        executorService.submit(subtractor);
//        Thread t1 = new Thread(adder);
//        Thread t2 = new Thread(subtractor);
//
//        t1.start();
//        t2.start();

        // join helps to wait the main thread, till t1 and t2 completes its work

//            t1.join();
//            t2.join();
        executorService.shutdown();

        // main thread --> print statement will execute once both the threads completes its work
        System.out.println(count.value);
    }
}
