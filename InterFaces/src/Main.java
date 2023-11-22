public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        animal.exist();

        bird.exist();
        bird.fly();
        bird.track();

        FlightEnabled fly = bird;
        fly.fly();


        Trackable track = bird;
        track.track();
    }
}

interface FlightEnabled
{
    void fly();
}

interface Trackable
{
    void track();
};
abstract class Animal
{
    String name;

    public abstract void exist();
}

class Bird extends Animal implements FlightEnabled , Trackable
{

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is Flying");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + " is Tracked");

    }

    @Override
    public void exist() {
        System.out.println(this.getClass().getSimpleName() + "Is Exist");

    }
}