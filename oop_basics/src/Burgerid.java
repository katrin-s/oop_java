public class Burgerid {
    public static void main(String[] args) {
        Burger klassikaline = new Burger("klassikaline burger", "loomaliha", "nisukukkel", 3.2);
        klassikaline.koostaBurger();
        klassikaline.valiLisand4();

        TervislikBurger tervislik = new TervislikBurger("tervislik burger", "kanaliha", "must teraleib", 3.6);
        tervislik.koostaBurger();

        LuxBurger lux = new LuxBurger("Lux burger", "loomaliha", "seesamiseemnetega kukkel", 3.8);
        lux.koostaBurger();
    }
}
