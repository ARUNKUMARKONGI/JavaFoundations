package InputOutput;

import java.util.Scanner;
public class hasNextIntBasic {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value: ");
        if(scan.hasNextInt())
        {
            int x = scan.nextInt();
            System.out.println("Your entered value: " + x);
        }
        else {
            System.out.println("Please entered the Integer value. ");
        }
        scan.close();
    }
}