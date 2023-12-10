package InputOutput;
import java.util.Scanner;
public class StringFormatExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            String res = String.format("Hello, %s! You are %d years old.", name, age);

            System.out.println("Enter your city: ");
            sc.nextLine(); // consume the newline character, as u entered integer in prev line
            String city = sc.nextLine();
            System.out.println(res+" from "+city);

            sc.close();
        }
    }

