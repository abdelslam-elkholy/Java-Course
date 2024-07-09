import dev.lpa.DaysOfWeek;

import java.util.Random;

public class EnumSec {
    public static void main(String[] args) {
        DaysOfWeek weekDay = DaysOfWeek.FRI;
        System.out.println(weekDay.ordinal());
        for (int i =0; i < 10; i++)
        {
//            DaysOfWeek day = randomeDay();
//            System.out.println("Day: " + day + " is " + day.ordinal());
            switchDay(randomeDay());
        }
    }

    public static DaysOfWeek randomeDay()
    {
        int randomeIndex = new Random().nextInt(7);
        var allDays = DaysOfWeek.values();

        return allDays[randomeIndex];
    }
    public static void switchDay(DaysOfWeek day)
    {
        int dayIndex = day.ordinal() +1 ;

        switch (day)
        {
            case FRI -> System.out.println("Friday is day " + dayIndex);
            default -> System.out.println(day.name().charAt(0)
                    + day.name().substring(1).toLowerCase()+
                    "day is day " + dayIndex);
        }
    }
}
