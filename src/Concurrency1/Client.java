package Concurrency1;

public class Client {
    public static void main(String[] args) {

        // printing the current thread name
        // JVM is creating the thread
        System.out.println("Hello : Main Thread " + Thread.currentThread().getName()); // main

        // Object of a task
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();

        Thread thread2 = new Thread(helloWorldPrinter);
        thread2.start();


        System.out.println("Hello : Main Thread " + Thread.currentThread().getName()); // main

    }
}

/*
 * Task : Print Hello world from a new thread
 *
 * 1. Create a task
 *      -> Create a task class
 *      -> Make this class implement Runnable interface
 *      -> Implement the run() method.
 * 2. Create a Thread
 *      -> Create a Thread object
 * 3. Assign the task to the thread
 *      -> Pass task object inside the constructor of thread class
 * 4. Start the thread.
 *      -> thread.start();
 *
 * */
