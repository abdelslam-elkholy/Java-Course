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
        acc.deposite(50);
        System.out.println(acc.getAccountBalance());

        acc.withdrawl(-5);
        acc.withdrawl(10000);
        acc.withdrawl(50);
        System.out.println(acc.getAccountBalance());

        Customer cu1 = new Customer();
        System.out.println(cu1.getName() +" "+ cu1.getEmail() +" "+ cu1.getCreditlimit());

        Customer cu2 = new Customer("abdelslam" , "abdelslam@customer");
        System.out.println(cu2.getName() +" "+ cu2.getEmail() +" "+ cu2.getCreditlimit());

        Customer cu3 = new Customer("customer3" , "cuwstomer3@customer.com" , 500);
        System.out.println(cu2.getName() +" "+ cu2.getEmail() +" "+ cu2.getCreditlimit());
    }


}
