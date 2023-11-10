import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        System.out.println(array[1]);

        int[] array2 = new int[]{1 , 2 , 3 , 4};
        for(int i =0; i < array2.length ;i++ )
        {
            System.out.println(array2[i]);
        }

        for (int ele : array2)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array2));

        Object objectVar = array2;
        if(objectVar instanceof int[])
        {
            System.out.println("This object var is instance of int array");
        }

        Object[] objectArray = new Object[]{"hello" , 2 , objectVar};
        for (Object ele : objectArray)
        {
            System.out.print(ele + " ");
        }
    }
}
