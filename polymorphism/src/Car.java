public class Car {
    private String description ;

    private boolean isOn;

    public Car(String description) {
        this.description = description;
        this.isOn = false;
    }

    private void runEngine()
    {
        isOn = !isOn;
    }

    public void startEngine()
    {
        runEngine();
        System.out.println("Checking Car .....");
    }

    public void drive()
    {
        if(!isOn)
        {
            return;
        }


    }

}

class ElectricCar extends Car
{
    private double power;
    private double avgKmPerCharge;
    private double batteryRange;

    public ElectricCar(String description, double power) {
        super(description);
        this.power = power < 1 ? 0 : Math.min(100 , power);
        batteryRange = 500;
        avgKmPerCharge = (batteryRange * power) / 100;
    }

    @Override
    public void drive() {
        super.drive();

        if (power < 10)
        {
            System.out.println("Your Battery Is low Got to charge");
        }


    }
}