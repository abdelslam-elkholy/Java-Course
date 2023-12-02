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
    }
}

