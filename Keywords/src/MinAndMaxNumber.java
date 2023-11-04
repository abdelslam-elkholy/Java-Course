import java.util.Scanner;

public class MinAndMaxNumber {

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        do{
            System.out.println("Enter Your Number: ");
            try{
                int num = Integer.parseInt(scanner.nextLine());
                min = Math.min(min, num);
                max = Math.max(max , num);

            }catch (NumberFormatException e)
            {
                System.out.println("The Max Number Is: " + max + " & The Min Number is: " + min);
                exit = true;
            }
        }while (!exit);
    }


}
