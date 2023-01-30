package Gun32._03_Encapsulatıon;

import java.util.ArrayList;

public class Okul {


    private String okulAd;
    private int kontenjan;

    private ArrayList<Ogrenci>Ogrenciler=new ArrayList<>();



    public Okul(String okulAd, int kontenjan) {
       setOkulAd(okulAd);
       setKontenjan(kontenjan);
    }


    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        Ogrenciler = ogrenciler;


    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return Ogrenciler;
    }
}

