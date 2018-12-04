public class TervislikBurger extends Burger {

    private String tervislikLisand1;
    private Double tervislikLisand1Hind;
    private String tervislikLisand2;
    private Double tervislikLisand2Hind;

    public TervislikBurger(String nimetus, String liha, String sai, Double hind) {
        super(nimetus, liha, sai, hind);
        this.tervislikLisand1 = "avokaado";
        this.tervislikLisand1Hind = 1.1;
        this.tervislikLisand2 = "hummus";
        this.tervislikLisand2Hind = 0.8;
    }

    @Override
    public void koostaBurger() {
        System.out.println("See on " + this.getNimetus() + " " + this.getLiha() + "ga, mille ümber on " + this.getSai() + " ning hind on " + this.getHind() + "€.");
    }
}
