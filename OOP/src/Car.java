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

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        if(make == null)
        {
            this.make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake)
        {
            case  "tesla" , "honda" , "porche" -> this.make = make;
            default ->
                this.make = "Unsupported";
        }
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

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
