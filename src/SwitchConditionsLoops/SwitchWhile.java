package SwitchConditionsLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n1. JAVA");
            System.out.println("2.  C");
            System.out.println("n3. DS");
            System.out.println("4. PYTHON");
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            switch (ch)
            {

                case 1 -> {
                    sc.nextLine();  //when u enter string after reading input, u need to add
                    //one more nextline stmt to remove space
                    System.out.println("enter the name of the author:");
                    String str = sc.nextLine();
                    System.out.println("name of the author is :" + str);
                    }
                case 2 -> System.out.println("no books available");
                default -> System.out.println("invalid input");
            }

        }
    }
}
