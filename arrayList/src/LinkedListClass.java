import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

//    LinkedList<String> linkedList = new LinkedList<>();
    var places = new LinkedList<String>();
     places.add("Cairo");
     places.add("Alex");
     System.out.println(places);

     places.addLast("Shebeen");
     places.addFirst("Meno");
     System.out.println(places);

     places.offer("Place 1");
     places.offerFirst("Place offer first");
     places.offerLast("Place offer last");
     System.out.println(places);

     places.push("Stack Place Push");
     System.out.println(places);


    }
}
