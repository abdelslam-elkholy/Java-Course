public class Printer {
    private int tonerLevel;
    private int pagesprinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        this.tonerLevel = tonerLevel < 0 ? 0 :Math.min(tonerLevel, 100);
        this.pagesprinted =0;
        this.duplex = duplex;
    }

    public Printer() {
        this(100 ,  false);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int setTonerLevel(int tonerLevel) {
     if (tonerLevel < 0 || tonerLevel > 100)
     {
         return  -1;
     }
     return this.tonerLevel = tonerLevel;
    }

    public int getPagesprinted() {
        return pagesprinted;
    }

    public int printPages(int pages)
    {
        int sheets = duplex ?( pages / 2 ) + (pages % 2): pages;

        pagesprinted+=sheets;
//        System.out.println("Number Of Pages printed is : " + sheets +" and the printer is duplix");
        return sheets;
    }




}
