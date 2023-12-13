package Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class LargestPower3version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger num = scanner.nextBigInteger();
        BigInteger result = powerOfThree(num);
        System.out.println("Result: " + result);
    }

    private static BigInteger powerOfThree(BigInteger num) {
        int power = (int) (Math.log(num.intValue()) / Math.log(3));
        return BigInteger.valueOf(3).pow(power-1);
    }
}
