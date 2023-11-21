public class Boxing {
    public static void main(String[] args) {
        Double boxDouble = 100.00;
        double regDouble = 100.00;

        System.out.println(boxDouble.getClass().getName());
//        System.out.println(regDouble.get);

        double unboxDouble = boxDouble;
//        System.out.println(unboxDouble.getClass().getName());
        Double boxReg = regDouble;
        System.out.println(boxReg.getClass().getName());
    }
}
