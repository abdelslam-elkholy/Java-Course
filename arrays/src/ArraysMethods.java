import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    public static void main(String[] args) {

       int[] arr1 =  generateArray(10);
       System.out.println(Arrays.toString(arr1));

        System.out.println("-".repeat(20));

       int[] arr2 = generateArray(15);
       System.out.println(Arrays.toString(arr2));
       Arrays.sort(arr2);
       System.out.println(Arrays.toString(arr2));

        System.out.println("-".repeat(20));

        int[] arr3 = generateArray(10);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = arr3;
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr3));

        System.out.println("-".repeat(20));

        int[] arr5 = Arrays.copyOf(arr2 , arr2.length);
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = Arrays.copyOf(arr5 , arr5.length/2);
        System.out.println(Arrays.toString(arr6));

    }

    private static int[] generateArray(int length)
    {
        Random random = new Random();
        int[] array = new int[length];

        for(int i=0; i < length; i++)
        {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
