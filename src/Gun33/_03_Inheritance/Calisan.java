package Gun33._03_Inheritance;

public class Calisan {

    private String ad;
    private double maas;
    private double maasKatSyi;

    public Calisan(String ad, double maas, double maasKatSyi) {
        setAd(ad);
        setMaas(maas);
        setMaasKatSyi(maasKatSyi);
    }

    public Calisan() {

    }




    public double maasHesapla() {
        return maas * maasKatSyi;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getMaas() {

        return maas;
    }

    public void setMaas(double maas) {

        this.maas = maas;

    }

    public double getMaasKatSyi() {
        return maasKatSyi;
    }

    public void setMaasKatSyi(double maasKatSyi)
    {
        this.maasKatSyi = maasKatSyi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ad='" + ad + '\'' +
                ", maas=" + maas +
                ", maasKatSyi=" + maasKatSyi +
                "maaş hesapla=" + maasHesapla() +

                '}';
    }
}
