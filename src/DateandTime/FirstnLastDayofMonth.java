package DateandTime;
import java.util.*;
import java.time.*;
//import java.text.*;
public class FirstnLastDayofMonth {

        public static void main(String []args){
            YearMonth ym = YearMonth.of(2023, 12);

            String firstDay = ym.atDay(1).getDayOfWeek().name();
            String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
            System.out.println();
            System.out.println(firstDay);
            System.out.println(lastDay);
            System.out.println();
        }
    }
