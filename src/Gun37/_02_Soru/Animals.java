package Gun37._02_Soru;

public class Animals {


    private  String cinsi;
    private String renk;

    public Animals(String cinsi, String renk) {
       setCinsi(cinsi);
       setRenk(renk);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "cinsi='" + cinsi + '\'' +
                ", renk='" + renk + '\'' +
                '}';
    }
}
