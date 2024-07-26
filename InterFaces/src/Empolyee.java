public class Empolyee extends Worker{
    private String hireDate;
    private long employeeId;

    private static int empId = 1;
    public Empolyee(String name, String dob, String hireDate) {
        super(name, dob);
        this.hireDate = hireDate;
        this.employeeId = Empolyee.empId++;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
