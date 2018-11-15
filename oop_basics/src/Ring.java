public class Ring {
    public double raadius;
    public double x;
    public double y;

    public Ring() {
        this.raadius = 0.0;
    }

    public Ring(double r) {
        this.raadius = r;
    }

    public void pindala() {
        double ringiPindala = Math.PI * Math.pow(raadius, 2);
        System.out.println("Ringi pindala on " + Math.round(ringiPindala * 100) / 100.0);
    }
}
