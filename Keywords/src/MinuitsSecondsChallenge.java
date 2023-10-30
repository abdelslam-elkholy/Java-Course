public class MinuitsSecondsChallenge {
    public static void main(String[] args) {
    String time = convertTime(33380);
    System.out.println(time);
    }

    public static String convertTime(int sec)
    {
        if(sec < 0)
        {
            return "Invalid Input";
        }



        return convertTime(sec % 60, sec / 60);

    }

    public static String convertTime(int sec , int minuits)
    {

        return minuits / 60 + " h " + minuits % 60 + " m " + sec + " s ";
    }
}
