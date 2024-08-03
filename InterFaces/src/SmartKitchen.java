public class SmartKitchen {
    private DishWasher dishWasher =new DishWasher();
    private CoffeMaker coffeMaker = new CoffeMaker();
    private Refregator refregator = new Refregator();

    public void addWater() {
        coffeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        refregator.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setState(boolean one , boolean two , boolean three) {
        coffeMaker.setHasWorkToDo(one);
        refregator.setHasWorkToDo(two);
        dishWasher.setHasWorkToDo(three);
    }

    public void doKitchenWork() {
        coffeMaker.brewCoffee();
        refregator.orderFood();
        dishWasher.doDishes();
    }

}


class CoffeMaker  {

    private boolean hasWorkToDo = false;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee() {
       if (this.hasWorkToDo) {
           System.out.println("Making Coffee ....");
           hasWorkToDo = false;
       }
    }
}

class Refregator  {

    private boolean hasWorkToDo = false;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordring Food ....");
            hasWorkToDo =false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo = false;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing Dishes ...");
            hasWorkToDo = false;
        }
    }
}