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
    public Monitor(String model, String manufactuerer) {
        super(model, manufactuerer);
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
        System.out.printf("Program %d is now loading...\n" , programName);
    }
}

class ComputerCase extends Product {
    public ComputerCase(String model, String manufactuerer) {
        super(model, manufactuerer);
    }
}