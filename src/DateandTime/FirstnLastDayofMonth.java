package DateandTime;
import java.util.*;
import java.time.*;
//import java.text.*;
public class FirstnLastDayofMonth {

        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();
            int year = sc.nextInt();
            YearMonth ym = YearMonth.of(year, month);

            String firstDay = ym.atDay(3).getDayOfWeek().name();
            String lastDay = ym.atEndOfMonth().getDayOfWeek().name();

            System.out.println(firstDay);
            System.out.println(lastDay);
        }
    }
