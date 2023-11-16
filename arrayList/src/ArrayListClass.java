import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

    public static void main(String[] args) {
        int [][] towDimensioalArray = new int[3][2];
        System.out.println(Arrays.deepToString(towDimensioalArray));

        ArrayList<Grocery> groceryList = new ArrayList<>();
        groceryList.add(new Grocery("Coffee"));
        groceryList.add(new Grocery("Cheese" , "Market" , 5));
        System.out.println(groceryList);



    }
    record Grocery(String name , String type , int count)
    {


   Grocery(String name) {
            this(name, "Daiary", 1);
        }


    }
}
