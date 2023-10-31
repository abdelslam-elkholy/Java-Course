public class ChallengeFour {
    public static void main(String[] args) {

sum();

    }

    public static void sum()
    {
        int acc = 0;
        int sum = 0;

        for(int i =1; i <=1000; i++)
        {
            if(i % 3 == 0 && i %5 == 0)
            {
                acc++;
                sum+=i;
                System.out.println(i);
                if (acc == 5)
                {
                    break;
                }
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
