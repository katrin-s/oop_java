public class Printer {
    public Integer tooneriTase;
    public Integer paberPrintimiseks;
    public Boolean kahepoolne;

    public Printer(Integer tooneriTase, Boolean kahepoolne) {
        this.tooneriTase = tooneriTase;
        this.kahepoolne = kahepoolne;
        this.paberPrintimiseks = 100;
    }
}
