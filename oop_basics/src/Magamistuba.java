public class Magamistuba {
    public static void main(String[] args) {
//        loome 4 seina toa ehitamiseks
        Sein sein1 = new Sein("põhi");
        Sein sein2 = new Sein("lõuna");
        Sein sein3 = new Sein("lääne");
        Sein sein4 = new Sein("ida");

        Lagi lagi = new Lagi(3.5, "soe valge");

        Voodi voodi = new Voodi("Anna", 60, 2, 4, 1);
        voodi.voodiLoomine();

        Lamp lamp = new Lamp("Kati", true);
        lamp.lulita(); // lülitasime sisse
        System.out.println("Nüüd saab magada");
        lamp.lulita(); // lülitame välja

    }
}