package Problems;
import java.util.Scanner;

public class DigitSumUsingString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                String input = sc.nextLine();

                int sum = 0;
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);

                    if (Character.isDigit(ch)) {
                        sum += ch - '0';
                       // sum = sum1 + Integer.parseInt(""+ch);
                        //sum += Integer.parseInt(String.valueOf(ch));
                        // sum += Character.getNumericValue(ch);
                    } else if (Character.isAlphabetic(ch)) {
                      throw new Exception("Only digits are allowed");
                    } else {
                        throw new Exception("Special characters not allowed");
                    }
                }
                System.out.println(sum);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


 // sum += ch - '0';
//sum += Integer.parseInt(String.valueOf(ch));
// sum += Character.getNumericValue(ch);