import java.util.Scanner;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        long res = PalindromeChecker(num);

        System.out.println("Next Smallest Palindrome: " + res);

        scanner.close();
    }
    private static long PalindromeChecker(long num) {
        while (true) {
            num++;
            if (isPalindrome(num)) {
                return num;
            }
        }
    }
    private static boolean isPalindrome(long num) {
        long originalNum = num;
        long rev = 0;

        while (num > 0) {
            long digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return originalNum == rev;
    }
}
