package _1Sessions;
import java.util.*;
public class Integerbinary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            // Convert to binary, hex, and octal
            String binary = Integer.toBinaryString(num);
            String hex = Integer.toHexString(num);
            String octal = Integer.toOctalString(num);

            // Display the results
            System.out.println("Binary: " + binary);
            System.out.println("Hexadecimal: " + hex);
            System.out.println("Octal: " + octal);

            int decimal = Integer.parseInt(octal, 8);
            System.out.println(decimal);

            scanner.close();
        }
    }

