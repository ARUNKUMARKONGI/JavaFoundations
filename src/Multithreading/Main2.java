package Multithreading;

public class Main2 {
    public static void main(String[] args) {
        Thread t=new Thread(()-> System.out.println("Thread ID: "+Thread.currentThread().getId()));
       t.start();
        
    }
    
}
