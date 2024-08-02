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
    public MotherBoard(String model, String manufactuerer) {
        super(model, manufactuerer);
    }
}
class ComputerCase extends Product {
    public ComputerCase(String model, String manufactuerer) {
        super(model, manufactuerer);
    }
}