public class Ristkulik extends Kujund {
    // klassi omadused - klassi muutujad
    private Double pikkus;
    private Double laius;
    private Integer nurk;

    public Ristkulik(String nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        this.nurk = 90;
        this.setNurkadeOlemasolu(true);
        this.setNurkadeArv(4);
        System.out.println("Ristküliku klassi konstruktor");
    }

    @Override
    public void valjastaKirjeldus() {
        System.out.println("Ristküliku klassi valjastaKirjeldus()");
        System.out.println(this.getNimetus());
        System.out.println("Pikkus = " + this.pikkus);
        System.out.println("Laius = " + this.laius);
        if (this.getNurkadeOlemasolu()) {
            System.out.println("Kokku on " + this.getNurkadeArv() + " nurka");
        }
        System.out.println("Nurgad = " + this.nurk + " kraadi");
    }
}
