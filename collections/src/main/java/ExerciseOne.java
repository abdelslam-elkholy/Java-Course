import java.util.HashSet;
import java.util.Set;

public class ExerciseOne {
    public static void main(String[] args) {

//        List<Car> cars = new ArrayList<>();
        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Toyota" , "Corolla" , Color.BLACK));
        cars.add(new Car("Toyota" , "Corolla" , Color.BLACK));
        cars.add(new Car("Toyota" , "Corolla" , Color.BLUE));
        cars.add(new Car("Toyota" , "Corolla" , Color.RED));

        for (Car car: cars)
        {
            System.out.println(car);
        }
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
