public class getGreatestDivisor {

    public static void main(String[] args) {

    }
    public static int getGreatestCommonDivisor(int first , int second)
    {
        if(first < 10 || second < 10)
        {
            return -1;
        }

        int div = 1;
//        int smallest = first > second ? second : first;
        int smallest = Math.min(first, second);
        for(int i =2; i<= smallest; i++)
        {
            if(first % i == 0 && second % i == 0)
            {
                div = i;
            }
        }

        return div;
    }

}
