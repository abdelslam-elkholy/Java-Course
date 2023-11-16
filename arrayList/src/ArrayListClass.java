import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

    public static void main(String[] args) {
        int [][] towDimensioalArray = new int[3][2];
        System.out.println(Arrays.deepToString(towDimensioalArray));

        ArrayList<Grocery> groceryList = new ArrayList<>();


    }
    record Grocery(String name , String type , int count)
    {


        public Grocery(String type, int count) {
            this(null, "Daiary", 1);
        }


    }
}
