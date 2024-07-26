public class Empolyee extends Worker{
    private String hireDate;
    private long employeeId;

    public Empolyee(String name, String dob, String hireDate, long employeeId) {
        super(name, dob);
        this.hireDate = hireDate;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
