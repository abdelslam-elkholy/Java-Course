public class DishWasher {
    private boolean hasWorkTodo;

    DishWasher()
    {
        hasWorkTodo = false;
    }

    public boolean getHasWorkToDo()
    {
        return hasWorkTodo;
    }

    public void doDishes()
    {
        if (hasWorkToDo ) System.out.println("Ordering Food .....");
    }
}
