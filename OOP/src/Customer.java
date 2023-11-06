public class Customer {
    private String name;
    private int creditlimit;
    private String email;

    Customer(String name ,String email, int creditlimit )
    {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    Customer(String name , String email)
    {
        this(name , email , 999);
    }

    Customer()
    {
        this("ahmed" , "ahmed@customer.com");
    }
    public String getName() {
        return name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }

}
