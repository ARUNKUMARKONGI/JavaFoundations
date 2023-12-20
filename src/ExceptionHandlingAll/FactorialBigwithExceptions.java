package ExceptionHandlingAll;
import java.math.BigInteger;
import java.util.*;

public class FactorialBigwithExceptions  {
    public static void main(String[] args) throws GrietException{
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
            System.out.println("Special Characters and Alphabets are not allowed.");
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

