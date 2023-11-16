import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        int [][] towDimensioalArray = new int[3][2];
        System.out.println(Arrays.deepToString(towDimensioalArray));

        ArrayList<Grocery> groceryList = new ArrayList<>();
        groceryList.add(new Grocery("Coffee"));
        groceryList.add(new Grocery("Cheese" , "Market" , 5));
        System.out.println(groceryList);

        Grocery[] groceriesArray = {new Grocery("coffe") , new Grocery("Milk") , new Grocery("Sugar")};
        ArrayList<Grocery> groceriesTwo = new ArrayList<>(List.of(groceriesArray));
        System.out.println(groceriesTwo);

        ArrayList<Grocery> groceriesThree = new ArrayList<>();
        groceriesThree.add(0,new Grocery("Rice"));
        groceriesThree.add(1,new Grocery("Pepsi"));
        groceriesThree.set(0,new Grocery("Rice2"));
        groceriesThree.addAll(groceriesTwo);
        System.out.println(groceriesThree);
        System.out.println(groceriesThree.get(1));

        ArrayList<String> stringList = new ArrayList<>(List.of("Tea" , "Coffee" , "Sugar" , "Water" , "Water"));
        System.out.println( stringList.lastIndexOf("Water"));
        System.out.println(stringList.indexOf("Water"));
        System.out.println(stringList.contains("Tea"));

    }
    record Grocery(String name , String type , int count)
    {


   Grocery(String name) {
            this(name, "Daiary", 1);
        }

    @Override
        public String toString()
    {
        return String.format("%d %s in %s" , count , name , type);
    }
    }
}
