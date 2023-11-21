public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Wolf" , "Big" , 100);
        Animal fish = new Fish("Golden" , "Small" , 2);

        doAnimalStuff(dog);
        doAnimalStuff(fish);

    }

    public static void doAnimalStuff(Animal animal)
    {
        animal.move("Slow");
        animal.makeNoise();
    }
}
