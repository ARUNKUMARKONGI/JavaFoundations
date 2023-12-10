package Problems;
import java.math.BigInteger;
import java.util.Scanner;
public class BigIntegerFactorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                BigInteger num = new BigInteger(input);

                if (num.compareTo(BigInteger.ZERO) < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    BigInteger result = calculateFactorial(num);
                    System.out.println("Factorial of " + num + " is:\n" + result);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }

            scanner.close();
        }

        private static BigInteger calculateFactorial(BigInteger num) {
            BigInteger result = BigInteger.ONE;

            while (num.compareTo(BigInteger.ZERO) > 0) {
                result = result.multiply(num);
                num = num.subtract(BigInteger.ONE);
            }

            return result;
        }
    }

   /* private static BigInteger findFactorial(BigInteger number) {
        BigInteger fact = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }

        return fact;
    }*/