public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("hey");
        System.out.println(car.getMake());

        car.setMake(null);
        System.out.println(car.getMake());

        car.setMake("Honda");
        System.out.println(car.getMake());
        car.descipe();
    }
}
