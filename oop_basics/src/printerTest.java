public class printerTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, false);
        System.out.println("Printeris on " + printer1.paberPrintimiseks + " lehte printimiseks.");
        System.out.println("Printeri tooneri tsse on " + printer1.tooneriTase);
        printer1.paberPrintimiseks = 45;
        printer1.tooneriTase = 120;
        System.out.println("Printeris on " + printer1.paberPrintimiseks + " lehte printimiseks.");
        System.out.println("Printeri tooneri tsse on " + printer1.tooneriTase);
    }
}
