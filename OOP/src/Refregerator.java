public class Refregerator {
    private boolean hasWorkToDo;

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
        if (hasWorkToDo ) System.out.println("Ordering Food .....");
    }
}
