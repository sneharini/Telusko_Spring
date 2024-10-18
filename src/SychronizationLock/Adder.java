package SychronizationLock;

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

            lock.lock();    // acquire
            //critical section
            count.value += i;
            //critical section
            lock.unlock();  // release
        }
    }
}
