public class IsSharedDigit {

    public static void main(String[] args) {
System.out.println(        hasSharedDigit(25 , 67));
        System.out.println(     hasSharedDigit(18 , 85));
    }

    public static boolean  hasSharedDigit(int first , int second)
    {
        if(first < 10 || first > 99 || second < 10 || second > 99)
        {
            return false;
        }


        int fir = first;

        while(fir > 0)
        {
            int firDigit = fir %10;
            int sec = second;

            while(sec > 0)
            {
                int secDigit = sec % 10;

                if(firDigit == secDigit)
                {
                    return true;
                }

                sec/=10;
            }
            fir/=10;
        }


        return false;
    }
}
