public class LuxBurger extends Burger {
    public LuxBurger() {
        super("LuxBurger", "Steik", "Valge sai", 10.0);
        super.valiLisand1("Frii-Kartul", 2.0);
        super.valiLisand2("Jook", 2.5);
    }

    @Override
    public void valiLisand1(String lisand1, Double lisand1Hind) {
        System.out.println("Lisandi valimine ei ole võimalik");
    }

    @Override
    public void valiLisand2(String lisand2, Double lisand2Hind) {
        System.out.println("Lisandi valimine ei ole võimalik");
    }

    @Override
    public void valiLisand3(String lisand3, Double lisand3Hind) {
        System.out.println("Lisandi valimine ei ole võimalik");
    }

    @Override
    public void valiLisand4(String lisand4, Double lisand4Hind) {
        System.out.println("Lisandi valimine ei ole võimalik");
    }
}