public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(int currentDate)
    {
        return currentDate - Integer.parseInt(birthDate);
    }

    public void terminate(String endDate)
    {
        this.endDate = endDate;
    }

}
