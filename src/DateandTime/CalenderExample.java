package DateandTime;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("current date time:");
        System.out.format("%tB %te %tY\n",c,c,c);
        System.out.format("%tl:%tM %tp\n",c,c,c);
        System.out.format("%tH:%tM\n",c,c);

        //LocalTime time = LocalTime.now();
        LocalTime time = LocalTime.now().withMinute(0).withSecond(0).withNano(0);
        System.out.println(time);
    }
}
