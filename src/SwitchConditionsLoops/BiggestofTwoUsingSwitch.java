package SwitchConditionsLoops;
import java.util.Scanner;
public class BiggestofTwoUsingSwitch {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

           // System.out.printf("Enter two numbers separated by space: ");
            String inputLine = input.nextLine();
            String[] numbers = inputLine.split(" ");

            if (numbers.length != 2) {
                System.out.println("Only 2 Numbers are allowed");
                return;
            }

            try {
                int n1 = Integer.parseInt(numbers[0]);
                int n2 = Integer.parseInt(numbers[1]);
                int res = Integer.compare(n1, n2);

                switch (res) {
                    case 0:
                        System.out.printf("Both numbers are equal\n");
                        break;
                    case 1:
                        System.out.printf("Maximum Number is %d\n", n1);
                        break;
                    case -1:
                        System.out.printf("Maximum Number is %d\n", n2);
                        break;
                    default:
                        System.out.printf("Invalid comparison result\n");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Only Integers are allowed");
            }
        }
    }
