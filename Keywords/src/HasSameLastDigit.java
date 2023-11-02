public class HasSameLastDigit {

    public static void main(String[] args) {

    }

    public static boolean  hasSameLastDigit(int first , int second , int third)
    {
        if(!isValid(first) || !isValid(second) || !isValid(third))
        {
            return false;
        }

        int firstLast = first %10;
        int secondLast = second %10;
        int thirdLast = third % 10;


        if(firstLast == secondLast || firstLast == thirdLast || thirdLast == secondLast )
        {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num)
    {
        return num >= 10 && num <= 1000;
    }
}
