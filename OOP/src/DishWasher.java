public class DishWasher {
    private boolean hasWorkToDo;

    DishWasher()
    {
        hasWorkToDo = false;
    }

    public boolean getHasWorkToDo()
    {
        return hasWorkToDo;
    }

    public void doDishes()
    {
        if (hasWorkToDo ) System.out.println("Washing Dishes.....");
    }
}
