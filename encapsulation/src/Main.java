public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(100 , true);
        printer.printPages(5);
       System.out.println( printer.getPagesprinted());
        printer.printPages(8);
        System.out.println( printer.getPagesprinted());

        System.out.printf("the pages before is %d and The pages to print is %d \n and the pages after %d " ,
                printer.getPagesprinted() , printer.printPages(5) , printer.getPagesprinted());
    }
}
