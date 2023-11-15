import java.util.InputMismatchException;
import java.util.Scanner;

public class MinimumArray {
    public static void main(String[] args) {
    readIntegers();
    }

    public static void readIntegers()
    {
        Scanner scanner = new Scanner(System.in);
do {
 try {
     System.out.print("Enter Your Array Length: ");
     int num = scanner.nextInt();
     System.out.println(num);
     break;
 }catch (InputMismatchException e)
 {
     System.out.println("Enter Valid Number");
     scanner.nextLine();
 }
}while (true);
    }
}
