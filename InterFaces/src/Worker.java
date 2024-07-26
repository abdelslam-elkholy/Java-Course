public class Worker {
    private String name;
    private String dob;
    protected String endDate;

    public Worker(){
        this.name = "Anonymous";
        this.dob = "01/01/2000";
    }
    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
    public int getAge(){
        int currentYear = 2024;

        return currentYear - Integer.parseInt(this.dob.substring(6));
    }

    public double collectPay() {
        return 0.0;
    }
    public void terminates(String endDate){
        this.endDate = endDate;
        System.out.println("Worker had been terminated in " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
