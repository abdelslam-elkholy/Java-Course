public class CoffeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

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
        if (hasWorkToDo )
        {
            System.out.println("Making Coffee .....");
            hasWorkToDo = false;
        }
    }
}
