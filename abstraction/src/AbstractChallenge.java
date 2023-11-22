import java.util.ArrayList;

public class AbstractChallenge {
}

abstract class ProductForSale
{
    protected String type;
    protected double price;
    protected String descreption;

    public ProductForSale(String type, double price, String descreption) {
        this.type = type;
        this.price = price;
        this.descreption = descreption;
    }

    public final double getSalesPrice(int quantity)
    {
        return quantity * price;
    }

    public final void printPricedLine(int quant)
    {
        System.out.println("Type" + " ".repeat(10) +
                "Qt " +" ".repeat(3) +
                "Price");
        System.out.println(type + " ".repeat(10) +
                 quant + " ".repeat(3) +
                "$" + price);
    }

    public abstract void showDetails();


}

class ProductA extends ProductForSale
{

    public ProductA(String type, double price, String descreption) {
        super(type, price, descreption);
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + type + "\n"+
                            "Price: " + price +"\n"+
                             "Descreiption " + descreption);
    }

}

class ProductB extends ProductForSale
{

    public ProductB(String type, double price, String descreption) {
        super(type, price, descreption);
    }

    @Override
    public void showDetails() {

            System.out.println("Product: " + type + "\n"+
                    "Price: " + price +"\n"+
                    "Descreiption " + descreption);

    }

}

record OrderItem(int quantity , ProductForSale product)
{}

class Store
{
    ArrayList<ProductForSale> products;
    Store()
    {
        products = new ArrayList<>();
    }

    public void addToOrder()
    {

    }
}