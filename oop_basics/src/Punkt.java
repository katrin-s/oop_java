public class Punkt {
    private String nimetus;
    private Double x;
    private Double y;
    private Integer veerand;

    public Punkt(String nimetus, Double x, Double y) {
        this.nimetus = nimetus;
        this.x = x;
        this.y = y;
        this.setVeerand();
    }

    public void setVeerand() {
        if (this.x > 0 & this.y > 0) this.veerand = 1;
        else if (this.x > 0 & this.y < 0) this.veerand = 2;
        else if (this.x < 0 & this.y < 0) this.veerand = 3;
        else if (this.x < 0 & this.y > 0) this.veerand = 4;
        else this.veerand = 0;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void valjastaKirjeldus() {
        System.out.println("See on punkt " + this.nimetus + " ja selle koordinaadid on " + this.x + " ja " + this.y);
        System.out.println("Punkt " + this.nimetus + " asub " + this.veerand + "." + " veerandil");
    }
}
