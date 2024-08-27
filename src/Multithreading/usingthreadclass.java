package Multithreading;

public class usingthreadclass extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " - " + i);
                try {
                    Thread.sleep(3000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public static void main(String[] args) {
            usingthreadclass thread1 = new usingthreadclass();
            usingthreadclass thread2 = new usingthreadclass();
            
            thread1.setName("Thread 1");
            thread2.setName("Thread 2");
            
            thread1.start();
            thread2.start();
        }
    }

