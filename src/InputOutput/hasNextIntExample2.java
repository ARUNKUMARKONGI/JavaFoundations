package InputOutput;

import java.util.Scanner;
public class hasNextIntExample2 {
    public static void main(String[] args) {
        //Initialize the scanner  
        Scanner scan = new Scanner("James bond 777");
        while(scan.hasNext()){
            //If the next is a int, print found and the int with radix 16  
            if (scan.hasNextInt()) {
                System.out.println("Found :" + scan.nextInt());
            }
           try { //If no int is found, print "Not Found" and the token
               System.out.println("Not Found :" + scan.next());
           }catch(Exception e){
               System.out.println("error no input");
           }
        }
        scan.close();
    }
} 