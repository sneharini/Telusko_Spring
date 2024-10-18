package Sychronized_Method;

public class Count {
    private int value = 0;

    // synchronized method helps one thread execute this method
    // only one thread can call this synchronized method for one object at a time
    public synchronized void addValue(int i){
        value += i;
    }

    // getter
    public int getValue() {
        return value;
    }
}
