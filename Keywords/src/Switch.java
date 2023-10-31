public class Switch {
    public static void main(String[] args) {

        String month = "JANUARY";
        System.out.print(findQuarter(month));
    }

    public static String findQuarter(String month)
    {
      return  switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH", "APRIL" -> "1st";
            case "MAY" ,"JUNE" ,"JULY" -> "2nd";
            default -> "not valid";
        };
    }
}
