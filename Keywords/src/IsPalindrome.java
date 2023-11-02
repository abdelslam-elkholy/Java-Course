public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1441));

    }


        public static boolean isPalindrome(int number)
        {
            int num = number;
            int reserved=0;

            while(num > 9)
            {
                int lastDigit = num %10;
                reserved*=10;
                reserved+=lastDigit;
                num/=10;
            }


            return ( reserved *10 + num) == number;
        }


}
