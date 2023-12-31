import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinimumArray {
    public static void main(String[] args) {
//          int length = getLength();
//
//          int [] array = readIntegers(length);
//
//          System.out.println(Arrays.toString(array));
//          int min = findMin(array);
//          System.out.println(min);
       int[] array =  getInputs();
        System.out.println(Arrays.toString(array));
       int min = findMin(array);
        System.out.println(min);
        int[]reversed = reverseArray(array);
        System.out.println(Arrays.toString(reversed));

    }

    public static int getLength()
    {
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                 System.out.print("Enter Your Array Length: ");
                  length = scanner.nextInt();
                 System.out.println(length);
                 break;

             }catch (InputMismatchException e)
                 {
                     System.out.println("Enter Valid Number");
                     scanner.nextLine();
                 }
        }while (true);
                   return length;
    }
    public static int[] readIntegers(int length)
    {
            int[] array = new int[length];
             Scanner scanner = new Scanner(System.in);
             for (int i =0; i<length; i++)
             {
                 try
                 {         System.out.print("Enter The Element Number " + (i+1) + "of the array: ");
                       array[i] =  scanner.nextInt();
                 }
                 catch (InputMismatchException e)
                 {
                              System.out.println("Invalid input try again ");
                              scanner.nextLine();
                              i--;
                 }
             }

                  return array;
    }

       public static int findMin(int[] arr)
       {
           int min = arr[0];

           for (int i = 1; i < arr.length; i++)
           {
               min = Math.min(min , arr[i]);
           }

           return min;
       }

       public static int[] getInputs()
       {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter Your Array elements seperated by comma: ");
           String string = scanner.nextLine();
           String[] splited = string.split(",");
           int[] array = new int[splited.length];
           for(int i =0; i <splited.length; i++)
           {
               array[i] = Integer.parseInt(splited[i]);
           }
         return array;

       }

       private static int[] reverseArray(int[] arr)
       {
           int[] reversed = new int[arr.length];
           for (int i = 0; i<arr.length; i++)
           {
               reversed[i] = arr[arr.length-1-i];
           }
           return reversed;
       }
}

