package Sychronized_Method2;

public class Count {
    private int value = 0;

    // synchronized method helps one thread execute this method
    // only one thread can call this synchronized method for one object at a time
    public synchronized int addValue(int i){
        value += i;
        return value;
    }
    public synchronized int subtractValue(int i) {
        value -= i;
        return value;
    }
    // getter
    public int getValue() {
        return value;
    }
}
