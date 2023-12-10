package InputOutput;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first big integer: ");
        String num1 = sc.nextLine();

        System.out.print("Enter the second big integer: ");
        String num2 = sc.next();

        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);

        // Perform operations
        BigInteger sum = b1.add(b2);
        BigInteger product = b1.multiply(b2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
