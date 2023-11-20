import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
    public static void main(String[] args) {

//    LinkedList<String> linkedList = new LinkedList<>();
    var places = new LinkedList<String>();
     places.add("Cairo");
     places.add("Alex");
     places.add(0,"Al");
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

    places.remove(0);
    places.remove("Alex");
    System.out.println(places);

//    places.remove();
//    System.out.println( places.remove());
//    places.removeFirst();
//    System.out.println(places);
//
//
//    places.pop();
//    System.out.println(places);
//    places.poll();
//    System.out.println(places);


       System.out.println( places.getFirst());
       System.out.println( places.getLast());
       System.out.println( places.element());
       System.out.println( places.peek());
       System.out.println( places.peekFirst());

        System.out.println("Trips Starts at " +  places.getFirst());
        for (int i = 1; i < places.size(); i++ )
        {
            System.out.println("--> : "+ places.get(i-1) + " to " + places.get(i));

        }
        System.out.println("Trip Ended at " +  places.getLast());

        String town = places.getFirst();
        ListIterator<String> iterator = places.listIterator(1);
        System.out.println("Trips Starts at " +  town);

        while (iterator.hasNext())
        {
            String town2 = iterator.next();
            System.out.println("--> : "+ town + " to " + town2);
            town = town2;

        }
        System.out.println("Trip Ended at " +  places.getLast());

    }



}
