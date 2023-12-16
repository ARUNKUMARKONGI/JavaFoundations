package ExceptionHandlingAll;
import java.util.*;
public class Sum1stnLastMultipleCatch {
        public static int firstandlastsum(int number) {
            int num = number;

            if (num < 0) {
                throw new IllegalArgumentException("Input number cannot be negative");
            } else {
                int c=0;
                int num1=number;
                int last = num1 % 10;
                int count = 0;
                while (num > 0)
                {
                    num = num / 10;
                    count++;
                }
                //System.out.println(count);
                int first = (int) (number / Math.pow(10, count - 1));
                return first + last;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                //System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                int result = firstandlastsum(num);
                System.out.println("Sum of first and last digits: " + result);
            } catch (InputMismatchException e) {
                System.out.println("Error: Input is not a valid integer or Max Integer value is reached.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
