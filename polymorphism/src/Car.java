public class Car {
    private String description ;

    private boolean isOn;

    public Car(String description) {
        this.description = description;
        this.isOn = false;
    }

    private void runEngine()
    {
        isOn = true;
    }

    public void startEngine()
    {
        runEngine();
        System.out.println("Checking Car .....");
    }

    public void drive()
    {
if (!isOn)
{
    startEngine();
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
        System.out.println("Engine Started ..");
        if (power < 10)
        {
            System.out.println("Your Battery Is low Go to charge");
            return;
        }
        System.out.println("Estimately " + avgKmPerCharge + " Kms Remaning For nextCharge");
        System.out.println("Start Drive");
    }
}

class GasCar extends Car
{
    private double power;
    private double avgKmPerCharge;
    private double tankRange;

    public GasCar(String description, double power) {
        super(description);
        this.power = power < 1 ? 0 : Math.min(100 , power);
        tankRange = 230;
        avgKmPerCharge = (tankRange * power) / 100;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Engine Started ..");
        if (power < 10)
        {
            System.out.println("Your Gas Is low Go to gas Station");
            return;
        }
        System.out.println("Estimately " + avgKmPerCharge + " Kms Remaning For next Gas Charge");
        System.out.println("Start Drive");
    }
}
