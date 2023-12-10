import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {

//        List<Car> cars = new ArrayList<>();
        Set<Car> cars = new HashSet<>();

        Map<String , Car> table = new HashMap<>();


        cars.add(new Car("Toyota" , "Corolla" , Color.BLACK));
        cars.add(new Car("Toyota" , "Corolla" , Color.BLACK));
        cars.add(new Car("Toyota" , "Corolla" , Color.BLUE));
        cars.add(new Car("Toyota" , "Corolla" , Color.RED));

        table.putIfAbsent("Ahmed",new Car("Toyota" , "Corolla" , Color.BLUE));
        table.putIfAbsent("Mohammed" , new Car("Toyota" , "Yaris" , Color.RED));
        table.putIfAbsent("Abdelslam" , new Car("Toyota" , "Fortune" , Color.BLACK));
        table.putIfAbsent("Ahmed",new Car("Toyota" , "Fortune" , Color.BLACK));



        for (Car car: cars)
        {
            System.out.println(car);

        }
        for (Map.Entry ent: table.entrySet())
        {
            System.out.printf("%s is Owner of %s%n" , ent.getKey() , ent.getValue());
        }
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color);
    }
}

enum Color {
    RED,
    BLUE,
    WHITE,
    BLACK
}
