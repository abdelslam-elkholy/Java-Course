public class Dog extends Animal {

    private String earShap;
    private String tailShape;

    public Dog(){
        super("Mutt" , "Big" , 50);
    }
   public Dog(String type , double weight){
        this(type , weight , "perky" , "Curled");
   }
    public Dog(String type,  double weight, String earShap, String tailShape) {
        super(type, weight < 15 ? "small": (weight < 35 ? "medium" : "larg"), weight);
        this.earShap = earShap;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShap='" + earShap + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
