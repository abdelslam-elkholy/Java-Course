public class SmartKitchen {
    private Refregerator refregerator;
    private DishWasher dishWasher;
    private CoffeMaker coffeMaker;

    public SmartKitchen() {
        refregerator = new Refregerator();
        dishWasher = new DishWasher();
        coffeMaker = new CoffeMaker();
    }

    public void addWater()
    {
        refregerator.setHasWorkToDo(true);
    }

    public void pourMilk()
    {
        coffeMaker.setHasWorkToDo(true);
    }

    public void loadDishWasher()
    {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKetchinState(boolean dishWasher , boolean coffeMaker , boolean refregator)
    {
        this.dishWasher.setHasWorkToDo(dishWasher);
        this.coffeMaker.setHasWorkToDo(coffeMaker);
        this.refregerator.setHasWorkToDo(refregator);
    }


    public void doKitchenWork()
    {
        dishWasher.doDishes();
        coffeMaker.brewCoffee();
        refregerator.orderFood();
    }
}
