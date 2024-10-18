package Concurrency2.printNumber1to100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

//        //NumberPrinter numberPrinter = null;
//        //Thread thread = null;
//        for(int i = 1; i <= 100; i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }
        // 10 threads created
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 1; i < 100;i++){

            if(i == 5 || i == 10 || i == 95){
                System.out.println("Hello");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
        executorService.shutdown();
    }
}
