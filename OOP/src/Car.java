public class Car {
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    private String model = "Model-x";
private String make ="Tesla";
private String color = "White";
private int doors = 4;
private boolean convertable = true;

public  void descipe() {
    System.out.println(doors + "-Door "+
            color + " " +
            make + " " +
            model + " " +
                    (convertable ?" convertable" : "" )
            );

}

}
