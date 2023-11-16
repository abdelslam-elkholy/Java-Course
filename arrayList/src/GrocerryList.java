import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GrocerryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        do {
            System.out.print("""
                    Available Actions:
                    0 - To Shut Down
                    1 - To Add Item(S) to List
                    2 - To Remove Items From List
                    Enter A number For Which Action you want to do:\s""");


           int choose = Integer.parseInt(scanner.nextLine());
           if (choose ==0) break;
           else if (choose == 1) {
               System.out.print("Enter Your Items Separated By Comma: ");
               String items = scanner.nextLine();
               String[] itemsArray = items.split(",");
               for (String item : itemsArray)
               {
                    if(!arrayList.contains(item))
                    {
                        arrayList.add(item);
                    }
               }
               arrayList.sort(Comparator.naturalOrder());
               System.out.println(arrayList);


           } else if (choose == 2) {
               System.out.print("Enter Your Items Separated By Comma: ");
               String items = scanner.nextLine();
               String[] itemsArray = items.split(",");
               for(String item : itemsArray)
               {
                   arrayList.remove(item);
               }
               arrayList.sort(Comparator.naturalOrder());
               System.out.println(arrayList);
           }

        }while (true);

    }


}
