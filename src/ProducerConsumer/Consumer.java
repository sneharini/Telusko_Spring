package ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private String name;
    private int maxSize;


    Consumer(Queue<Object> store, String name, int maxSize){
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        while(true){
            if(!store.isEmpty()){
                System.out.println("Consumer name is "+ this.name +" and size is" + store.size());
                store.remove();
            }
        }
    }
}
