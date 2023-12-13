package Problems;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntnextSmallestPalindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String str = scanner.nextLine();
            BigInteger n = new BigInteger(str);
            BigInteger res = findNextSmallestPalindrome(n);

            System.out.println("Next Smallest Palindrome: " + res);
            scanner.close();
        }

        private static BigInteger findNextSmallestPalindrome(BigInteger num) {
            num = num.add(BigInteger.ONE);
            while (!isPalindrome(num)) {
                num = num.add(BigInteger.ONE);
            }
            return num;
        }

        private static boolean isPalindrome(BigInteger num) {
            String strNum = num.toString();
            int len = strNum.length();
            for (int i = 0; i < len / 2; i++) {
                if (strNum.charAt(i) != strNum.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

/*import java.util.Scanner;

public class BigIntnextSmallestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        long res = findNextSmallestPalindrome(num);

        System.out.println("Next Smallest Palindrome: " + res);
        scanner.close();
    }

    private static long findNextSmallestPalindrome(long num) {
        num++;
        while (!isPalindrome(Long.toString(num))) {
            num++;
        }
        return num;
    }

    private static boolean isPalindrome(String strNum) {
        int len = strNum.length();
        for (int i = 0; i < len / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}*/
/*
In Java, the long data type is a 64-bit signed primitive data type. It has a range from
 -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (inclusive).
  maximum length of digits (rather than the magnitude of the value),
  you can have up to 19 digits for a long variable.
  This is because 10^18 is the largest power of 10 that can be represented precisely in a long
  without loss of precision.
 For example, the number 9,223,372,036,854,775,807 has 19 digits.
 Similarly for integer For example, the number 2,147,483,647 has 10 digits. so max 10^9*/
