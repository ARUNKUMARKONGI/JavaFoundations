package Problems;
import java.util.Scanner;
import java.math.BigInteger;
public class BigIntDigitSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            BigInteger n1 = new BigInteger(n);
            BigInteger sum = BigInteger.ZERO;

           // n1.compareTo(BigInteger.ZERO) != 0
            while (!n1.equals(BigInteger.ZERO)) {
                BigInteger lastDigit = n1.mod(BigInteger.TEN);
                sum = sum.add(lastDigit);
                n1 = n1.divide(BigInteger.TEN);
            }

            System.out.println(sum);
        }
    }
