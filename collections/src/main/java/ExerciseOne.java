import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {

//        List<Car> cars = new ArrayList<>();
        Set<Car> cars = new LinkedHashSet<>();
        List<String> names = new ArrayList<>(List.of("Ahmed" , "Mohammed" , "Mahmoud"));
        Map<String , Car> table = new HashMap<>();


        cars.add(new Car("Toyota" , "Corolla" , Color.BLACK));
        cars.add(new Car("Toyota" , "Corolla" , Color.BLACK));
        cars.add(new Car("Toyota" , "Corolla" , Color.BLUE));
        cars.add(new Car("Toyota" , "Corolla" , Color.RED));

        int i =0;
        for (Car car: cars)
        {
            table.putIfAbsent(names.get(i) , car);
            i++;
        }

        for (Car car: cars)
        {
            System.out.println(car);

        }
        System.out.println(table);
    }
}

record Car(  String brand, String model, Color color) {
    @Override
    public String toString() {
        return "Brand new " + color.toString().charAt(0)+color.toString().substring(1).toLowerCase()+ " " +brand+" "+ model ;
    }
}

enum Color {
    RED,
    BLUE,
    WHITE,
    BLACK
}
