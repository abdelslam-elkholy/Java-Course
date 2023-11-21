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