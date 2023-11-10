import java.util.Arrays;
import java.util.Random;

public class SortChallenge {
    public static void main(String[] args) {

        int[] arr = generateRandomeArray(10);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arrCopy = Arrays.copyOf(arr , arr.length);
        int len = arrCopy.length-1;
        for (int i = 0; i < arr.length; i++)
        {

            arr[i] = arrCopy[ len - i];
        }
        System.out.println(Arrays.toString(arr));

    }
    private static int[] generateRandomeArray(int length)
    {
        Random random = new Random();
        int[] newArr= new int[length];

        for (int i =0; i<length; i++)
        {
            newArr[i] = random.nextInt(1000);
        }
        return newArr;
    }
}
