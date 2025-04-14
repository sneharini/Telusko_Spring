package Threads;

public class DemonThreads {

    public static void main(String[] args) {

        // Creating the demon threads
        Thread demonthread = new Thread(() -> {
            while(true){
                try{
                    System.out.println("Daemon thread is running");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        // Set the thread as daemon
        demonthread.setDaemon(true);
        // Start the daemon thread
        demonthread.start();

        // Create and start a user thread
        Thread userThread = new Thread(() ->{
            System.out.println("User thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("User thread finished");
        });

        // start the user thread
        userThread.start();

    }
}
