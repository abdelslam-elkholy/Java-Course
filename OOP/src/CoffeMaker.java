public class CoffeMaker {
    private boolean hasWorkToDo;

    CoffeMaker()
    {
        hasWorkToDo = false;
    }

    public boolean getHasWorkToDo()
    {
        return hasWorkToDo;
    }

    public void brewCoffee()
    {
        if (hasWorkToDo ) System.out.println("Making Coffee .....");
    }
}
