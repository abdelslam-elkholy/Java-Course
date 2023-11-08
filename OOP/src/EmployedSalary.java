import java.util.Date;

public class EmployedSalary extends Empolyee {
    private double salary;
    private boolean isRetired;

    public EmployedSalary(String name, String birthDate, String endDate, long empolyeeId, String hireDate, double salary, boolean isRetired) {
        super(name, birthDate, endDate, empolyeeId, hireDate);
        this.salary = salary;
        this.isRetired = isRetired;
    }

    public void retire()
    {
        Date retireDate = new Date();
    }
}
