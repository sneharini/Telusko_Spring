package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;

        Producer p1 = new Producer(store, "p1", maxSize);
        Producer p2 = new Producer(store, "p2", maxSize);
        Producer p3 = new Producer(store, "p3", maxSize);

        Consumer c1 = new Consumer(store, "c1", maxSize);
        Consumer c2 = new Consumer(store, "c2", maxSize);

        //Threads for producer
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p1);
        t3.start();

        //Threads for consumers
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();

    }
}
