public class Car {
private String model;
private String make;
private String color;
private int doors;
private boolean convertable;

public  void descipe() {
    System.out.println(doors + "-Door "
            color + " " +
            make + " " +
            model + " " +
                    (convertable ?" convertable" : "" )
            );

}

}
