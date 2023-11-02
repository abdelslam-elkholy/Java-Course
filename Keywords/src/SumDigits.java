public class SumDigits {

    public static void main(String[] args) {

        int sum = 0;
        int num= 105306;
        while(num > 9 )
        {
            sum += num % 10;
            num /= 10;
        }

        sum+=num;
    }
}
