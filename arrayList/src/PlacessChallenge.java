import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlacessChallenge {
 public static void main(String[] args) {

 Trip trip = makeTrip();
  Scanner scanner = new Scanner(System.in);
  while (true)
  {
   ListIterator<City> iterator = trip.getCities().listIterator();
   System.out.println("""
           Available Actions:
           (F))orward 
           (B)ackward
           (L)ist Places
           (M))enu
           (Q)uit
           """);
   String input = scanner.nextLine();
   if(input.equals( "F"))
   {

       if (iterator.hasNext()) {
        System.out.println(iterator.next());
        iterator.next();
       } else {
        System.out.println("This Is last Trip");
       }
   }
   else if (input.equals("B"))
   {
    if (iterator.hasPrevious())
    {
     System.out.println(iterator.previous());
    }
    else {
     System.out.println("This Is First Trip");
    }
   }
   else if (input.equals("Q"))
   {
    break;
   }
  }

 }
 private static Trip makeTrip()
 {
  Trip trip = new Trip("Sydney");
  System.out.println(trip.getCities());

  trip.addCity("Adalida" , 1374);
  trip.addCity("Alice Springs" , 2771);
  trip.addCity("Brisbane" , 917);
  trip.addCity("Darwin" , 3972);

  return trip;

 }
}

class Trip
{
   private String name;
    private LinkedList<City> cities;

    Trip(String name)
    {
        this.name = name;
        cities = new LinkedList<>();
    }

    public String addCity(City city)
    {
      String name = city.name();
      int distance = city.distance();

      return addCity(name , distance);
    }

    public String addCity(String name , int distance)
    {
        boolean isExist = cityExist(name);

        if(isExist)
        {
         return "City Already Exist";
        }

        cities.add(new City(name , distance));
        return "City Added ...";
    }

    public boolean cityExist(String cityName)
    {

     boolean isExist = false;
     ListIterator<City> iterator = cities.listIterator();

     while(iterator.hasNext())
     {
      City city = iterator.next();
      if (city.name() == cityName)
      {
       isExist = true;
       break;
      }
     }
     return isExist;
    }

    public LinkedList<City> getCities()
    {
     return cities;
    }

}
record City(String name , int distance)
{


}