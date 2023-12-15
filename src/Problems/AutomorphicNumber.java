package Problems;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        boolean res = isAutomorphicNumber(number);

        if (res) {
            System.out.println(number + " is an automorphic number!");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    private static boolean isAutomorphicNumber(int num) {
        long square = (long) num * num;

        String n1 = String.valueOf(num);
        String n2 = String.valueOf(square);
       // String n3=Long.toString(square);

        return n2.endsWith(n1);
    }
}
