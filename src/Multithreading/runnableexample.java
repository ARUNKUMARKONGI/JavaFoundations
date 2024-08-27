package Multithreading;

public class runnableexample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new runnableexample(), "Thread 1");
        Thread thread2 = new Thread(new runnableexample(), "Thread 2");
        
        thread1.start();
        thread2.start();
    }
}