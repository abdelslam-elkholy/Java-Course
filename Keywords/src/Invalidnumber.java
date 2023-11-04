import java.util.Scanner;

public class Invalidnumber {
    public static void main(String[] args) {

        System.out.println(countNumbers());
    }

    public static int countNumbers()
    {
        int sum =0;
        int i = 1;
       boolean isValid = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number #" + i);
            try{
                sum+=Integer.parseInt(scanner.nextLine());
                i++;
                isValid = true;

            }
            catch (NumberFormatException e)
            {
                System.out.println("Only Numbers Allowed");
                isValid = false;
            }
        }while (!isValid || i < 6);

        return sum;
    }


}
