package DateandTime;
import java.time.LocalDate;
import java.util.Scanner;

public class DayoftheYear {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int date = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            LocalDate d = LocalDate.of(year,month, date);
            int dayOfYear = d.getDayOfYear();
            System.out.println("Day count of the year for " + year + ": " + dayOfYear);
        }
    }

