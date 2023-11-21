import java.util.ArrayList;

public class BankingChallenge {

}

class Customer
{
    String name;
    ArrayList<Double> transactions;

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
    String name;
    ArrayList<Customer> customers;

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