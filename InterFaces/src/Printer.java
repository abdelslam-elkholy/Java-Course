public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <=0 || tonerLevel > 100) return;
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int toner) {
        if (toner + tonerLevel <=0 || toner + tonerLevel> 100) return -1;
        return tonerLevel = tonerLevel + toner;
    }

    public int printPages(int pages) {
        if (pages <=0) return -1;

        int sheets = pages;
        if (duplex) {
          sheets =   sheets % 2 == 0 ? sheets / 2 :  (sheets + 1) / 2;
            System.out.println("The Printer is duplex");
        }
        return sheets;
    }
}


