package ProducerConsumerSemophore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Object> store;
    private String name;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Queue<Object> store, String name, int maxSize,
             Semaphore producerSemaphore,
             Semaphore consumerSemaphore){
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {

        while(true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //if(store.size() < maxSize){
            System.out.println("Producer name is "+ this.name +" and size is" + this.maxSize);
            store.add(new Object());

            //after producing shirt, consumer should be notify
            consumerSemaphore.release();
        }
    }
}
