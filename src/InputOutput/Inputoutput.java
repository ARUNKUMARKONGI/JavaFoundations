package InputOutput;

import java.util.Scanner;
public class Inputoutput {
    public static void main(String args[]){
        Scanner scan = new Scanner(" Int number is 21");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                System.out.println("Found Int Value: "+scan.next());
            }
            else{
                scan.next();
            }
        }
        scan.close();
    }
}  