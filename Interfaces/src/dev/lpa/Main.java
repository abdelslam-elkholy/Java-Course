package dev.lpa;

public class Main {

    public static void main(String[] args) {

//        Bird bird = new Bird();
//        Animal animal = bird;
//        FlightEnabled flier = bird;
//        Trackable tracked = bird;
//
//        animal.move();
////        flier.move();
////        tracked.move();
//
////        flier.takeOff();
////        flier.fly();
////        tracked.track();
////        flier.land();
//
//        inFlight(flier);
//        inFlight(new Jet());
//        Trackable truck = new Truck();
//        truck.track();
//
//        double kmsTraveled = 100;
//        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
//        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
//                kmsTraveled, milesTraveled);
//
//        LinkedList<FlightEnabled> fliers = new LinkedList<>();
//        fliers.add(bird);
//
//        List<FlightEnabled> betterFliers = new LinkedList<>();
//        betterFliers.add(bird);
//
//        triggerFliers(fliers);
//        flyFliers(fliers);
//        landFliers(fliers);
//
//        triggerFliers(betterFliers);
//        flyFliers(betterFliers);
//        landFliers(betterFliers);
//    }
//
//    private static void inFlight(FlightEnabled flier) {
//
//        flier.takeOff();
//        flier.fly();
//        if (flier instanceof Trackable tracked) {
//            tracked.track();
//        }
//        flier.land();
//    }
//
//    private static void triggerFliers(List<FlightEnabled> fliers) {
//
//        for (var flier : fliers) {
//            flier.takeOff();
//        }
//    }
//
//    private static void flyFliers(List<FlightEnabled> fliers) {
//
//        for (var flier : fliers) {
//            flier.fly();
//        }
//    }
//
//    private static void landFliers(List<FlightEnabled> fliers) {
//
//        for (var flier : fliers) {
//            flier.land();
//        }
//    }

//        BankAccount accOne = new BankAccount();
//        BankAccount accTwo = new BankAccount();
//
//        accOne.setBalance(1000);
//        accTwo.setBalance(1500);
//
//        accOne.setEmail("abdelslam.elkholy@gmail.com");
//        accTwo.setEmail("abdelslam.elkholy@gmail.com");
//
//        accOne.setPhoneNumber("01020597823");
//        accTwo.setPhoneNumber("01020597823");
//
//        accOne.setCustomerName("Abdelslam");
//        accTwo.setCustomerName("Abdelslam");
//
//        System.out.println("Hey " + accOne.getCustomerName() + " welcome  to our bank , your credit is " + accOne.getBalance());
//        System.out.println("Hey " + accTwo.getCustomerName() + " welcome  to our bank , your credit is " + accTwo.getBalance());
//
//        accOne.withdrawl(300);
//        accOne.withdrawl(300);
//        accOne.withdrawl(300);
//        accOne.withdrawl(300);
//
//        accTwo.withdrawl(400);
//        accTwo.withdrawl(400);
//        accTwo.withdrawl(400);
//        accTwo.withdrawl(400);


        for(int i =1; i<=5; i++){
            LpaStudent s = new LpaStudent("s926" + i ,
                    switch (i) {
                case 1 -> "Marry";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default ->  "Anonymous";
                    },
                    "26/10/1993",
                    "Java Master class");
            System.out.println(s);
        }
Student pojoStudent = new Student("s9264" , "Abdelslam" , "26/10/1993" ,"Lpa Java Class");
LpaStudent recordStudent = new LpaStudent("s9264" , "Abdelslam" , "26/10/1993" ,"Lpa Java Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);


        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}
