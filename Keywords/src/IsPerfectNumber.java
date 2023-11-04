public class IsPerfectNumber {

    public static void main(String[] args)
    {


    }



        public static boolean isPerfectNumber(int number){

            if (number < 1) {
                return false;
            }

            int acc = 0;

            for (int i =1; i< number; i++)
            {
                if(number % i == 0)
                {
                    acc+=i;
                }
            }

            return acc == number;
        }

}

