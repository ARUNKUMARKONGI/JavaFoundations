package Problems;

import java.math.BigInteger;
import java.util.*;

class GrietException extends InputMismatchException {
    public GrietException(String message) {
        super(message);
    }
}
public class BigIntegerFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            if (n < 0) {
                throw new GrietException("Factorial is not defined for negative numbers.");
            } else {
                BigInteger result = findFactorial(n);
                System.out.println("Factorial of " + n + " is:\n" + result);
            }
        } catch(GrietException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }

    public static BigInteger findFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}





   /* private static BigInteger findFactorial(BigInteger number) {
        BigInteger fact = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }

        return fact;
    }*/

 /*   int n=sc.nextInt();
    BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++){
                fact=fact.multiply(BigInteger.valueOf(i));
                }*/

/*
while (num.compareTo(BigInteger.ZERO) > 0) {
        result = result.multiply(num);
        num = num.subtract(BigInteger.ONE);
        }*/
