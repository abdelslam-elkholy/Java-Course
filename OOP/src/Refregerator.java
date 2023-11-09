public class Refregerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    Refregerator()
    {
        hasWorkToDo = false;
    }

    public boolean getHasWorkToDo()
    {
        return hasWorkToDo;
    }

    public void orderFood()
    {
        if (hasWorkToDo )
        {
            System.out.println("Ordering Food .....");
            hasWorkToDo = false;
        }
    }
}
