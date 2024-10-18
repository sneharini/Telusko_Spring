package Sychronized_Keyword;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Lock lock;

    Adder(Count count, Lock lock){
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {

        for(int i = 0 ; i < 1000; i++){
            // lock on count object
            synchronized (count){
                count.value += i;
            }

        }
    }
}
