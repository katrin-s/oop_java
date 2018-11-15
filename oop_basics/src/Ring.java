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

    public Double pindala() {
        double ringiPindala = Math.PI * Math.pow(raadius, 2);
        return ringiPindala;
    }

    public void ringiKirjeldus() {
        System.out.println("Antud ringi raadius on " + raadius);
        Double ringiPindala = pindala();
        System.out.println("Ringi pindala on siis " + Math.round(ringiPindala * 100) / 100.0);
    }
}
