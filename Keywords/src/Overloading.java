public class Overloading {

    public static void main(String[] args) {
double res = convertToCentimeters(8,5);
System.out.println(res);
res = convertToCentimeters(9 , 7);
        System.out.println(res);
    }
   public static double convertToCentimeters(int inches)
    {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feets ,int inches)
    {

       return convertToCentimeters(feets * 12 + inches );
    }
}
