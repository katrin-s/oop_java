public class printerTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, false);
        printer1.paberPrintimiseks = 45;
        System.out.println("Printeris on " + printer1.paberPrintimiseks + " lehte printimiseks.");
    }
}
