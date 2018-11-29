public class Printer {
    private Integer tooneriTase;
    private Integer paberPrintimiseks;
    private Boolean kahepoolne;

    public Printer(Integer tooneriTase, Boolean kahepoolne) {
        if (tooneriTase >= 0 & tooneriTase <= 100) {
            this.tooneriTase = tooneriTase;
        } else if (tooneriTase > 100) {
            this.tooneriTase = 100;
        } else {
            this.tooneriTase = 0;
        }
        this.kahepoolne = kahepoolne;
        this.paberPrintimiseks = 100;
    }

    public Integer getTooneriTase() {
        return tooneriTase;
    }

    public Integer lisaTooner(Integer toonerJuurde) {
        if (this.tooneriTase >= 0 & this.tooneriTase <= 100) {
            if (this.tooneriTase + toonerJuurde > 100) {
                return -1;
            }
            this.tooneriTase = this.tooneriTase + toonerJuurde;
            return this.tooneriTase;
        } else {
            return -1;
        }
    }

    public Integer prindi(Integer lehtedeArv) {
        Integer paberiKulu = lehtedeArv;
        if (this.kahepoolne) {
            paberiKulu = lehtedeArv / 2 + lehtedeArv % 2;
            System.out.println("Kahepoolne printimine");
        }
        this.paberPrintimiseks = this.paberPrintimiseks - paberiKulu;
        return paberiKulu;
    }

    public Integer getPaberPrintimiseks() {
        return paberPrintimiseks;
    }
}
