public class Empolyee extends Worker {
    private long empolyeeId ;
    private String hireDate;

    public Empolyee(String name, String birthDate, String endDate, long empolyeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.empolyeeId = empolyeeId;
        this.hireDate = hireDate;
    }



}
