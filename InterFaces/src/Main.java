public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Generic Animal" , "Huge" , 400);
//        Dog dog = new Dog();
//
//        doAnimalStuff(dog , "fast");
//    }
//    public static void doAnimalStuff(Animal animal , String speed){
//        animal.makeNoise();
//        animal.move(speed);
//        System.out.println(animal);
//        System.out.println("_ _ _ _");
//    }

//        Empolyee emp = new Empolyee("Abdelslam" , "26/10/1993","22/12/2023");
//        System.out.println(emp);
//        System.out.println(emp.getAge());
//        System.out.println(emp.collectPay());
//
//        System.out.println(  new Empolyee("Abdelslam" , "26/10/1993","22/12/2023"));
//
//        System.out.println("""
//                This is first Line
//                  - first ele
//                    *sub ele""");
//int age = 31;
//String name = "abdelslam";
//        System.out.printf("This Is %d and %d years old" , 20 , age);

    stringInFormat("Hello World");
    stringInFormat("");
    stringInFormat("\n \t");

    String myString = "Hello World";
        System.out.printf("index of \"r\" is: %d%n" , myString.indexOf('r'));
        System.out.printf("index of \"World\" is: %d%n" , myString.indexOf("World"));
        System.out.printf("Last index of \"L\" is: %d%n" , myString.lastIndexOf("l"));
        String str = "Hello World";
        StringBuilder strBldr = new StringBuilder("Hello World");


        str.concat(" ,Bye for now!");
        strBldr.append(" ,Bye for now!");
        printInformation(str);
        printInformation(strBldr);

        ComputerCase theCase = new ComputerCase("2208" , "Dell" , "240");
        Monitor theMonitor = new Monitor("27inch Beast" , "Acer" , 27 , "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("Bj-200" , "Asus" , 4 , 6 , "V2.44");

        PersonalComputer thePc = new PersonalComputer("2208" , "Dell" ,motherBoard , theMonitor , theCase);

       thePc.powerUp();

       SmartKitchen smartKitchen = new SmartKitchen();
       smartKitchen.doKitchenWork();

       smartKitchen.addWater();
       smartKitchen.pourMilk();
       smartKitchen.loadDishWasher();

       smartKitchen.doKitchenWork();

       smartKitchen.setState(true , true , false);
       smartKitchen.doKitchenWork();

    }
public static void printInformation(String string){
    System.out.println("String is = " + string);
    System.out.println("Length is = " + string.length());
}public static void printInformation(StringBuilder string){
    System.out.println("StringBuilder is = " + string);
    System.out.println("Length is = " + string.length());
    System.out.println("Capacity is = " + string.capacity());
}
public static void stringInFormat(String string){
        int length = string.length();
        if (string.isEmpty())
        {
            System.out.printf("String is Empty %n");
            return;
        }
        if (string.isBlank()){
            System.out.printf("String is blank");
        }
    System.out.printf("Length is:- %d %n", length);
    System.out.printf("First Char is:- %c %n", string.charAt(0));
    System.out.printf("Last Char is:- %c %n", string.charAt(length-1));
}
}