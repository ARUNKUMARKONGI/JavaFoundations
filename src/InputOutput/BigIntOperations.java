package InputOutput;
import java.math.BigInteger;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num =sc.nextBigInteger();
        //BigInteger num = new BigInteger(sc.next());
        //String str=sc.nextLine();
        //BigInteger num = new BigInteger(str);

        BigInteger a = num.add(BigInteger.ONE);
        BigInteger b = num.subtract(BigInteger.ONE);

        BigInteger sum = num.add(num);
        BigInteger difference = num.subtract(num);
        BigInteger product = num.multiply(num);

        BigInteger quotient = num.equals(BigInteger.ZERO) ? null : num.divide(num);


        System.out.println("Original Number: " + num);
        System.out.println("Incremented: " + a);
        System.out.println("Decremented: " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (quotient != null) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
