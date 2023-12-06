import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first big integer: ");
        String num1 = sc.next();

        System.out.print("Enter the second big integer: ");
        String num2 = sc.next();

        // Create BigInteger objects
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);

        // Perform operations
        BigInteger sum = bigInteger1.add(bigInteger2);
        BigInteger product = bigInteger1.multiply(bigInteger2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
