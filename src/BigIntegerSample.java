import java.math.BigInteger;
import java.util.*;
public class BigIntegerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b = sc.nextBigInteger();
        BigInteger sum = b.add(b);
        BigInteger inc = b.add(BigInteger.TEN);
        System.out.println(inc);
    }
}
