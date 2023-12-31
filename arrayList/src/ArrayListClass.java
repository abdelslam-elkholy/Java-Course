import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        stringList.addAll(List.of("li1" , "li2" , "li1" , "li1"));
        System.out.println(stringList);
        stringList.remove("li1");
        System.out.println(stringList);
        stringList.removeAll(List.of("li1"));
        System.out.println(stringList);
        System.out.println("Is Empty: " + stringList.isEmpty());
        stringList.clear();
        System.out.println("Is Empty: " + stringList.isEmpty());
        System.out.println( stringList);
        stringList.addAll(List.of("li1" , "li2" , "li3" , "li4"));
        System.out.println( stringList);
        stringList.addAll(Arrays.asList("li1" , "li2" , "li3" , "li4"));
        System.out.println( stringList);
        stringList.sort(Comparator.naturalOrder());
        System.out.println( stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println( stringList);

        var arrayListStrings = stringList.toArray(new String[stringList.size()]);
        System.out.println( Arrays.toString(arrayListStrings));
        var arrayListTwo = stringList.toArray();
        System.out.println( Arrays.toString(arrayListTwo));





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
