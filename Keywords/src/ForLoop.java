public class ForLoop {
    public static void main(String[] args) {
        double money = 100.00;

        for(double rate = 7.5; rate <= 10; rate+=0.25)
        {
            money+= money*(rate/100);
            System.out.println("Money is: " + money + " and Rate is: " + rate);
        }
    }

}


