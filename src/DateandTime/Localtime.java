package DateandTime;

import java.time.*;
public class Localtime {
    public static void main(String[] args)
    {
        LocalTime time = LocalTime.now();
        //LocalTime newTime = time.plusHours(4);
        System.out.println();
        // in hour, minutes, seconds, nano seconds
        System.out.println("Local time now : " + time);
        System.out.println();
    }
}

