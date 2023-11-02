public class SumFirstLastDigits {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2558));
    }
    public static int  sumFirstAndLastDigit(int number)
    {
        if (number < 0)
        {
            return -1;
        }

        int num = number;
        int sum = 0;
        int lastDigit = num %10;

        while(num > 9)
        {
            num /=10;
        }

        sum = lastDigit + num;

        return sum;

    }
}
