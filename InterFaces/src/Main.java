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

        Empolyee emp = new Empolyee("Abdelslam" , "26/10/1993","22/12/2023");
        System.out.println(emp);
        System.out.println(emp.getAge());
        System.out.println(emp.collectPay());

        System.out.println(  new Empolyee("Abdelslam" , "26/10/1993","22/12/2023"));

    }
}