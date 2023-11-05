public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.setMake("hey");
//        System.out.println(car.getMake());
//
//        car.setMake(null);
//        System.out.println(car.getMake());
//
//        car.setMake("Honda");
//        System.out.println(car.getMake());
//        car.descipe();


        BankAccount acc = new BankAccount();
        acc.setAccountNumber(2023);
        acc.setAccountBalance(500);
        acc.setEmail("abdelslam.elkholy@bank.com");
        acc.setCustomerName("Abdelslam");
        acc.setPhoneNumber("01020597823");

        System.out.println("Account Info: " +
                "- " + acc.getAccountNumber()+
                "- " + acc.getCustomerName()+
                "- " + acc.getAccountBalance()+
                "- " + acc.getEmail()+
                "- " + acc.getPhoneNumber());

        acc.deposite(-5);

    }
}
