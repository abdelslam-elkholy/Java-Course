import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {

        int length = getLength();
        int[] array = generateSortedArray(length);
        int[] sortedArray = sortArray(array);

        for(int i =0; i< sortedArray.length; i++)
        {
            System.out.println("Element " + i +" contents " + sortedArray[i]);
        }

    }

    public static int[] generateSortedArray(int length)
    {
        Random random = new Random();
        int[] array = new int[length];
        for (int i =0; i < length; i++)
        {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static int getLength() {
        int length = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter Your Array Length: ");
                length = s.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid integer.");
            }
        }

        return length;
    }

    public static int[] sortArray(int[] arr)
    {
        Arrays.sort(arr);
        int lengthIndex = arr.length-1;
        int[] sorted = Arrays.copyOf(arr , arr.length);
        for (int i=0; i<=lengthIndex; i++)
        {
            arr[i] = sorted[lengthIndex-i];
        }

        return arr;
    }
}
