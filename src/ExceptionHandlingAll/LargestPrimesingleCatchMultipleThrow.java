package ExceptionHandlingAll;
import java.util.*;
public class LargestPrimesingleCatchMultipleThrow {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            try {
                if (!in.hasNextInt()) {
                    throw new InputMismatchException("Please enter a valid integer.");
                }
                int number = in.nextInt();
                if (number < 0) {
                    throw new InputMismatchException("Please enter a non-negative number.");
                } else if (number == 0 || number == 1) {
                    throw new InputMismatchException("0 & 1 Neither a Prime Nor a Composite numbers");
                }
                LargestPrime(number);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }

        public static void LargestPrime(int number) {

            int i;
            long num = number;
            for (i = 2; i <= num; i++)
            {
                if (num%i == 0)
                {
                    num = num / i;
                    i--;
                }
            }

            System.out.println("The Largest Prime Factor of " + number + " is: " + i);
        }


        /*public static void LargestPrime(int number) {

        int num = number;
        int maxPrime = -1;
        while (number % 2 == 0) {                  //to check if num is div by 2
            maxPrime = 2;
            number >>= 1;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {         //to check for odd primes
            while (number % i == 0) {
                maxPrime = i;
                number/= i;
            }
        }

        if (number > 2) {           //if the remaining numb itself is a prime number
            maxPrime = number;
        }

        System.out.println("The Largest Prime Factor of " + num + " is: " + maxPrime);
    }*/
    }
