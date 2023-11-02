public class GetEvenDigitsSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1441));
    }

    static public int getEvenDigitSum(int number)
    {
        if (number < 0)
        {
            return -1;
        }

        int lastNumber =0;
        int sum = 0;

        while(number > 9)
        {

            lastNumber = number % 10;

            if(lastNumber % 2 == 0)
            {
                sum+=lastNumber;
            }

            number/=10;
        }

        return number % 2 == 0 ? sum+=number : sum;
    }

}
