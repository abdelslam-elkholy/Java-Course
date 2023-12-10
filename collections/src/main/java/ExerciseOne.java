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

        table.putIfAbsent("Ahmed",new Car("Toyota" , "Corolla" , Color.BLUE));
        table.putIfAbsent("Mohammed" , new Car("Toyota" , "Corolla" , Color.RED));
        table.putIfAbsent("Abdelslam" , new Car("Toyota" , "Corolla" , Color.BLACK));
        table.putIfAbsent("Adam",new Car("Toyota" , "Corolla" , Color.BLACK));



        for (Car car: cars)
        {
            System.out.println(car);

        }
        System.out.println(table);
    }
}

class Car  {
   private String brand;
    private String model;
    private Color color;

    public Car(String brand, String model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand new " + color.toString().charAt(0)+color.toString().substring(1).toLowerCase()+ " " +brand+" "+ model ;
    }

    public String getModel() {
        return model;
    }

//    @Override
//    public int compareTo(Object o) {
////        Car car = (Car) o;
////        return model.compareTo(car.model);
//        return 0;
//    }
}

enum Color {
    RED,
    BLUE,
    WHITE,
    BLACK
}
