package Multithreading;

import java.util.Scanner;
class MultithreadingTest implements Runnable {
  public void run()
  {
    try {
      // Displaying the running Thread
      System.out.println(
        "Thread " + Thread.currentThread().getName()
        + " is running");
    }
    catch (Exception e) {
      // exception is caught if occurred 
      System.out.println("Exception has occurred and is caught");
    }
  }
}


public class Main {
  public static void main(String[] args)
  {
    //int n = 6;// Number of threads
    
    Scanner sc =new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      Thread obj = new Thread(new MultithreadingTest());
      obj.start();
    }
  }
}
