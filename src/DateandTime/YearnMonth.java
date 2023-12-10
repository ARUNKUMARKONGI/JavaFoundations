package DateandTime;

import java.time.*;
public class YearnMonth{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userday, today);
        System.out.println("\nDifference between "+ userday +" and "+ today +": "
                + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
    }
}
