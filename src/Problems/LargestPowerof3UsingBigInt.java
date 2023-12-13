package Problems;
import java.math.BigInteger;
import java.util.Scanner;
public class LargestPowerof3UsingBigInt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BigInteger num = scanner.nextBigInteger();
            BigInteger result = findLargestPowerOf3(num);
            System.out.println("The largest power of 3 less than " + num + " is: " + result);
        }
        private static BigInteger findLargestPowerOf3(BigInteger num) {
            BigInteger power = BigInteger.ZERO;
            BigInteger base = BigInteger.valueOf(3);

            while (base.pow(power.intValue()).compareTo(num) < 0) {
                power = power.add(BigInteger.ONE);
            }
            return base.pow(power.intValue() - 1);
        }
    }

