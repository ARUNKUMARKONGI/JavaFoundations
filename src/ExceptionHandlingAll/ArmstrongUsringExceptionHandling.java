package ExceptionHandlingAll;
import java.util.Scanner;
    class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    class SizeException extends Exception {
        public SizeException(String message) {
            super(message);
        }
    }
public class ArmstrongUsringExceptionHandling {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                String input = scanner.nextLine();
                validateInput(input);
                long number = Long.parseLong(input);

                if (isArmstrongNumber(number)) {
                    System.out.println(input + " is an Armstrong number.");
                } else {
                    System.out.println(input + " is not an Armstrong number.");
                }
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (SizeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public static void validateInput(String input) throws InvalidInputException, SizeException {
            if (!input.matches("-?\\d+")) {
                throw new InvalidInputException("Input is not a valid integer.");
            }

            long num = Long.parseLong(input);
            if (num < Long.MIN_VALUE || num > Long.MAX_VALUE) {
                throw new SizeException("Input beyond the capacity of long integer.");
            }
        }

        public static boolean isArmstrongNumber(long num) {
            String numStr = Long.toString(num);
            int length = numStr.length();
            long sum = 0;

            for (int i = 0; i < length; i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                sum += Math.pow(digit, length);
            }
            return sum == num;
        }
    }
