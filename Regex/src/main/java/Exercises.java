import java.util.Random;

public class Exercises {

    public static void main(String[] args) {

        for (DaysOfWeek day : DaysOfWeek.values())
        {
            char dayOfWeekFirstChar = String.valueOf(day).charAt(0);
            String dayOfWeek = String.valueOf(day).toLowerCase();
            if(dayOfWeek.equals("sat") )
            {
                System.out.println(dayOfWeekFirstChar + dayOfWeek.substring(1) + "urday");
            } else if (dayOfWeek.equals("wed")) {
                System.out.println(dayOfWeekFirstChar + dayOfWeek.substring(1) + "nesday");

            }
            else {
                System.out.println(dayOfWeekFirstChar + dayOfWeek.substring(1) + "day");

            }
        }

        for (DaysOfWeek day : DaysOfWeek.values())
        {
            char dayOfWeekFirstChar = String.valueOf(day).charAt(0);
            String dayOfWeek = String.valueOf(day).toLowerCase();
            if(dayOfWeek.equals("sat") )
            {
                System.out.println( dayOfWeek + "urDay");
            } else if (dayOfWeek.equals("wed")) {
                System.out.println( dayOfWeek + "nesDay");

            }
            else {
                System.out.println(dayOfWeekFirstChar+dayOfWeek.substring(1) + "day");

            }
        }
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day.name().charAt(0) + day.name().substring(1).toLowerCase()+"day");
        }
        int max = DaysOfWeek.values().length;
        DaysOfWeek[] days = DaysOfWeek.values();
        for (int i =0; i < 10; i++)
        {
            Random random = new Random();
            int randome = random.nextInt(max);
            System.out.println(days[randome]);
        }

        for (DaysOfWeek day: DaysOfWeek.values())
        {
           System.out.println("We Eat "+day.eat.toUpperCase().charAt(0)+day.eat.substring(1) + " at " + day.name().charAt(0)+day.name().substring(1).toLowerCase()+"day"  );
        }

      System.out.println(  DaysOfWeek.valueOf("FRI").eat);
        String[] week = new String[]{"Saturday" , "Sunday" , "friday"};
        getMeals(week);
    }


    private static void  getMeals(String[] names)
    {
        for (String name : names)
        {
            System.out.println( DaysOfWeek.valueOf(name.toUpperCase().substring(0,3)).eat);

        }
    }
}

