package ProducerConsumerMutex;

import java.util.Queue;

public class Producer implements Runnable{

    private Queue<Object> store;
    private String name;
    private int maxSize;


    Producer(Queue<Object> store, String name, int maxSize){
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (store.size() < maxSize) {
                    System.out.println("Producer name is " + this.name + " and size is" + this.maxSize);
                    store.add(new Object());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
