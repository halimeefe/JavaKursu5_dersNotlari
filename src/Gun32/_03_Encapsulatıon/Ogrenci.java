package Gun32._03_Encapsulatıon;

public class Ogrenci {
    private String ad;
    private String  soyAd;
    private int yas;
     private int ID;  //ID Yİ FINAL YAPARSAK CLASTA ID ATA METODU YAZMAMIZ GEREKİR

     static int sayacID=1;

    public Ogrenci(String ad,String soyAd,int yas) {
        setAd(ad);
        setSoyAd(soyAd);
        setYas(yas);
        setID(sayacID++);

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {

        this.ID = ID;
    }
}

