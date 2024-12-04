package Sychronized_Method2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count1 = new Count();
        Count count2 = new Count();

        Thread t1 = new Thread(() -> {
            System.out.println(count1.addValue(10));
        });

        Thread t2 = new Thread(() -> {
            System.out.println(count1.subtractValue(5));
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count1.getValue());

    }
}
