public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    BankAccount()
    {
        System.out.println("Default Constructor");
    }

    BankAccount(String mail , String phone , int accountNumber , String customerName , double accountBalance)
    {
        email = mail ;
        phoneNumber = phone;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposite(double dep)
    {
        if(dep < 1 )
        {
            System.out.println("You Can't deposite less than 1$");
            return;
        }

        this.accountBalance+=dep;
    }

    public void withdrawl(double cash)
    {
        if(cash > this.accountBalance || cash < 1)
        {
            System.out.println("Your Balance is less than this amount");
            return;
        }

        this.accountBalance-=cash;
    }
}
