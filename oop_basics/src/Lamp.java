public class Lamp {
    private String nimetus;
    private Boolean patarei;
    private Boolean sisseLulitatud = false;
//    konstruktor

    public Lamp(String nimetus, Boolean patarei) {
        this.nimetus = nimetus;
        this.patarei = patarei;
    }
//    getterid

    public String getNimetus() {
        return nimetus;
    }

    public Boolean getPatarei() {
        return patarei;
    }

    public Boolean getSisseLulitatud() {
        return sisseLulitatud;
    }
    // setterid

    public void setSisseLulitatud(Boolean sisseLulitatud) {
        this.sisseLulitatud = sisseLulitatud;
    }

    //    sisse/välja lülitamine
    public void lulita() {
        if (sisseLulitatud == false) {
            sisseLulitatud = true;
            System.out.println("Lamp on sisse lülitatud");
        } else {
            sisseLulitatud = false;
            System.out.println("Lamp on välja lülitatud");
        }
    }
}