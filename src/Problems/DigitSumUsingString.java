package Problems;
import java.util.Scanner;

public class DigitSumUsingString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();

            int sum = 0;

            for (int i = 0; i < n.length(); i++) {
                sum += Character.getNumericValue(n.charAt(i));
                //sum+= Integer.parseInt(""+n.charAt(i));
            }

            System.out.println(sum);
        }
    }

