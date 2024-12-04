package Sychronized_Method2;

public class Adder implements Runnable{
    Count count;

    Adder(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 1000; i++){
            count.addValue(i);
        }
    }
}
