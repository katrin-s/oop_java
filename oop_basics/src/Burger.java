public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1hind;
    private String lisand2;
    private Double lisand2hind;
    private String lisand3;
    private Double lisand3hind;
    private String lisand4;
    private Double lisand4hind;

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
        this.lisand1 = "salat";
        this.lisand2 = "tomat";
        this.lisand3 = "muna";
        this.lisand4 = "juust";
        this.lisand1hind = 0.5;
        this.lisand2hind = 0.6;
        this.lisand3hind = 0.7;
        this.lisand4hind = 0.9;
    }

    public String getNimetus() {
        return nimetus;
    }

    public String getLiha() {
        return liha;
    }

    public String getSai() {
        return sai;
    }

    public Double getHind() {
        return hind;
    }

    public void valiLisand1() {
        System.out.println("Lisandiks on valitud " + this.lisand1 + ", mis maksab " + this.lisand1hind + "€.");
    }

    public void valiLisand2() {
        System.out.println("Lisandiks on valitud " + this.lisand2 + ", mis maksab " + this.lisand2hind + "€.");
    }

    public void valiLisand3() {
        System.out.println("Lisandiks on valitud " + this.lisand3 + ", mis maksab " + this.lisand3hind + "€.");
    }

    public void valiLisand4() {
        System.out.println("Lisandiks on valitud " + this.lisand4 + ", mis maksab " + this.lisand4hind + "€.");
    }

    public void koostaBurger() {
        System.out.println("See on " + this.nimetus + " " + this.liha + "ga, mille ümber on " + this.sai + " ning hind on " + this.hind + "€.");
    }

}
