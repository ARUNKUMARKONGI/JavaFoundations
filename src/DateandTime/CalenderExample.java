package DateandTime;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar c =Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY\n", c, c, c);
        System.out.format("%tl:%tM %tp\n", c, c, c);
        System.out.format("%tH:%tM%n", c, c);

        scanner.close();
    }
}
