public class Auto {
    private String nimetus;
    private Boolean mootor;
    private Integer rattad;
    private Integer voimsus;

    public Auto(String nimetus, Integer voimsus) {
        this.nimetus = nimetus;
        this.voimsus = voimsus;
        this.rattad = 4;
        this.mootor = true;
    }
}
