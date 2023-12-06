import java.util.Scanner;

public class MersenneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        boolean isMersenne = isMersenneNumber(number);


        if (isMersenne) {
            System.out.println(number + " is a Mersenne number!");
        } else {
            System.out.println(number + " is not a Mersenne number.");
        }

        scanner.close();
    }

    private static boolean isMersenneNumber(int num) {
        // A Mersenne number is of the form 2^n - 1
        // Check if the number is one less than a power of 2
        int power = 0;
        int mersenne = 1;

        while (mersenne < num) {
            power++;
            mersenne = (int) Math.pow(2, power) - 1;
        }
        return mersenne == num;
    }
}
