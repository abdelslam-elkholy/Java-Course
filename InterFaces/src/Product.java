public class Product {

    private String model;
    private String manufactuerer;
    private  int width;
    private int height;
    private int depth;

    public Product(String model, String manufactuerer) {
        this.model = model;
        this.manufactuerer = manufactuerer;
    }
}

class Monitor extends Product {
    private int size;
    private String resolution;

    public Monitor(String model, String manufactuerer) {
        super(model, manufactuerer);
    }

    public Monitor(String model, String manufactuerer, int size, String resolution) {
        super(model, manufactuerer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x , int y , String color) {
        System.out.println(String.format(
                "Drawing pixel At %d,%d in color %s" , x ,y , color
        ));
    }
}

class MotherBoard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public MotherBoard(String model, String manufactuerer) {
        super(model, manufactuerer);
    }

    public MotherBoard(String model, String manufactuerer, int ramSlots, int cardSlots, String bios) {
        super(model, manufactuerer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.printf("Program %s is now loading...\n" , programName);
    }
}

class ComputerCase extends Product {
    private String powerSupllier;

    public ComputerCase(String model, String manufactuerer) {
        super(model, manufactuerer);
    }

    public ComputerCase(String model, String manufactuerer, String powerSupllier) {
        super(model, manufactuerer);
        this.powerSupllier = powerSupllier;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

}