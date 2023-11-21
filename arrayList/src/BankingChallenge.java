import java.util.ArrayList;

public class BankingChallenge {

    public static void main(String[] args) {

        Bank cibBank = new Bank("CIB");
        Customer cust1 = new Customer("Abdelslam");
        cust1.addTransaction(500);
        cust1.addTransaction(400);

        Customer cust2 = new Customer("Ahmed");
        cust2.addTransaction(-190);
        cust2.addTransaction(9000);

        cibBank.addNewCustomer(cust1);
        cibBank.addNewCustomer(cust2);
        cibBank.addNewCustomer(cust1);

        cibBank.printStatement();

    }
}

class Customer
{
   private String name;
    private ArrayList<Double> transactions;

    Customer(String name )
    {
        this.name = name;
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction (double transaction)
    {
        transactions.add(transaction);
    }
}

class Bank
{
  private   String name;
  private    ArrayList<Customer> customers;

    Bank(String name)
    {
        this.name=name;
        customers=new ArrayList<>();

    }

    public void addNewCustomer(Customer customer)
    {
        if (!customers.contains(customer))
        {
            customers.add(customer);
        }

    }

    public void printStatement()
    {
        for (Customer customer: customers) {
            System.out.print(customer.getName() + ": {");
            for (double transaction : customer.getTransactions())
            {
                System.out.print(transaction + ", ");
            }
            System.out.println("}");
        }
    }
}