package Sessions;

import java.util.Scanner;
public class StringIntSum {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string with words and numbers: ");
        String input = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                int digit = Character.getNumericValue(currentChar);
                sum += digit;
            }
        }

        System.out.println("Sum of digits in the string: " + sum);

        scan.close();
    }
}
