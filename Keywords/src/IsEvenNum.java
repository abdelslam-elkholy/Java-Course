public class IsEvenNum {
    public static void main(String[] args) {
        int start = 5;
    int acc = 0;
        while (start <= 20)
        {
            if(isEvenNumber(start))
            {
                System.out.println(start);
                acc++;
            }
            if (acc >= 5 )
            {
                break;
            }
            start++;
        }
    }

    public static boolean isEvenNumber(int num)
    {
      return num % 2 == 0;
    }
}
