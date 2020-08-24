public class Printer {
    private int sheets;
    private int tonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets() {
        return sheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public void print(int pages, int copies) {
        int sheetsToPrint = pages * copies;
        if(sheetsToPrint <= this.sheets) {
            this.setSheets(this.sheets - (pages * copies));
        } else {
            System.out.println("Sorry, not enough paper in the printer");
        }
        this.setTonerVolume(this.tonerVolume - sheetsToPrint);
    }

}
