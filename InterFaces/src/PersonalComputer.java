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


    private void drawLogo() {
        monitor.drawPixelAt(10,10,"red");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
}
