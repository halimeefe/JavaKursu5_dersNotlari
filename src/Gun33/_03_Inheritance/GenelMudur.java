package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{
    private double tazminat;
    public  GenelMudur(String ad,double maas,double maasKatSyi,double tazminat){
        super(ad,maas,maasKatSyi);
        setTazminat(tazminat);
}

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }// GENERATE DEN OVERRİGHTTAN GET TAZMİNAT YAPTIK

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "ad=" + getAd() +
                "maas=" + getMaas() +
                "maasKatsayisi=" + getMaasKatSyi() +
                "tazminat=" + getTazminat()+
                "ödenecek maaş=" + maasHesapla() +
                '}';
    }
}
