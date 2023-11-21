public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (type == "Wolf")
        {
            System.out.println("Running Fast");
        }
        else {
            System.out.println("Walking Slow");
        }
    }

    @Override
    public void makeNoise() {

        if (type == "Wolf")
        {
            System.out.println("how .. how");
        }
        else {
            System.out.println("Grrrrrrrrrrrr");
        }
    }
}
