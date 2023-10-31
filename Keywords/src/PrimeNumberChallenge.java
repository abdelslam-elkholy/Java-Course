public class PrimeNumberChallenge {
    public static void main(String[] args) {

        for (int start = 2; start < 1000; start++)
        {
            boolean prime = detectPrime(start);
            if (prime)
            {
                System.out.println("number is: "+ start + " and is prime");
            }

        }
    }
    public static boolean detectPrime(int num)
    {
        boolean prime = true;
        for(int start = 2; start <= num/2; start++)
        {
            if(num % start == 0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
