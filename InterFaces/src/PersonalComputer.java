public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufactuerer, MotherBoard motherBoard, Monitor monitor, ComputerCase computerCase) {
        super(model, manufactuerer);
        this.motherBoard = motherBoard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
