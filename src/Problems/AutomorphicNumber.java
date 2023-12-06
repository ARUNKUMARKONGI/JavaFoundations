package Problems;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        boolean isAutomorphic = isAutomorphicNumber(number);

        if (isAutomorphic) {
            System.out.println(number + " is an automorphic number!");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    private static boolean isAutomorphicNumber(int num) {
        long square = (long) num * num;

        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }
}
