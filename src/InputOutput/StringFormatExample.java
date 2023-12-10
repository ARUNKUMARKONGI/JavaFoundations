package InputOutput;
import java.util.Scanner;
public class StringFormatExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            // Using String.format to create a formatted string
            String res = String.format("Hello, %s! You are %d years old.", name, age);

            // The formatted string can be used or printed later in the code
            // For this example, let's print it after taking additional input
            System.out.println("Enter your city: ");
            sc.nextLine(); // consume the newline character, as u entered integer in prev line
            String city = sc.nextLine();

            // Now print the formatted string
            System.out.println(res+" from "+city);

            // Other code can continue using the formattedString variable as needed

            sc.close();
        }
    }

