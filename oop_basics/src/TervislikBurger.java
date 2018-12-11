public class TervislikBurger extends Burger {
    private String lisandTervislik1;
    private Double lisandTervislik1Hind;

    private String lisandTervislik2;
    private Double lisandTervislik2Hind;

    public TervislikBurger(String liha, Double hind) {
        super("Tervislik Burger", liha, "Teraleib", hind);
    }

    public void valiTervislikLisand1(String lisandTervislik1, Double lisandTervislik1Hind) {
        this.lisandTervislik1 = lisandTervislik1;
        this.lisandTervislik1Hind = lisandTervislik1Hind;
    }

    public void valiTervislikLisand2(String lisandTervislik2, Double lisandTervislik2Hind) {
        this.lisandTervislik2 = lisandTervislik2;
        this.lisandTervislik2Hind = lisandTervislik2Hind;
    }

    @Override
    public Double koostaBurger() {
        Double hind = super.koostaBurger();
        if (this.lisandTervislik1 != null) {
            System.out.println("Lisatud " + this.lisandTervislik1 + " hinnaga " + this.lisandTervislik1Hind);
            hind = hind + this.lisandTervislik1Hind;
        }
        if (this.lisandTervislik2 != null) {
            System.out.println("Lisatud " + this.lisandTervislik2 + " hinnaga " + this.lisandTervislik2Hind);
            hind = hind + this.lisandTervislik2Hind;
        }
        return hind;
    }
}