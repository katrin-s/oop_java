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
        double s = 3.14 * raadius * raadius;
        System.out.println(s);
    }
}
