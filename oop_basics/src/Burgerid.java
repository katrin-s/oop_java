public class Burgerid {
    public static void main(String[] args) {
        Burger hamburger = new Burger("HAMBURGER", "veiseliha", "Valge sai", 2.5);
        hamburger.valiLisand1("tomat", 0.5);
        hamburger.valiLisand2("salat", 0.5);
        hamburger.valiLisand3("muna", 0.5);
        Double hamburgerihind = hamburger.koostaBurger();
        System.out.println("Lõpphind = " + hamburgerihind);
        System.out.println("======================================");

        TervislikBurger kalaburger = new TervislikBurger("kala", 4.0);
        kalaburger.valiTervislikLisand1("salat", 0.5);
        kalaburger.valiTervislikLisand2("kaste", 0.2);
        kalaburger.valiLisand1("oliivid", 0.3);
        Double kalaburgeriHind = kalaburger.koostaBurger();
        System.out.println("Lõpphind = " + kalaburgeriHind);
        System.out.println("======================================");

        LuxBurger lux = new LuxBurger();
        lux.valiLisand1("salat", 0.5);
        lux.valiLisand2("kaste", 0.2);
        lux.valiLisand3("oliivid", 0.3);
        Double luxburgeriHind = lux.koostaBurger();
        System.out.println("Lõpphind = " + luxburgeriHind);
    }
}