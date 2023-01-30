package Gun32._01_Encapsulatıon;

public class Kişi {
    private String ad;// 25 karakter olsun // GERÇEK PROGRAMLARDA PRİVATE YAPARIZ GEREKİRSE AÇARIZ
    private String soyad;
    private int yas;//korumaya aldım
    // ENCAPSULATION KORUMAYA ALMA DEMEKTİR ACCESS MODFİER I PRİVATE YAPARSAK ÖZELLEŞTİRMİŞ OLUYORUZ
    // KORUMAYA ALIYORUZ
    // BÖYLECE BİZİM İSTEMEDİĞĞMİZ CLASLARDAN VE PAKETLERDEN ULAŞILAMAZ
    // PROGRAMIN GÜVENLİĞİ AÇISINDAN HERZAMAN PRİVATE YAPARIZ GEREKLİ OLURSA AÇARIZ

    void yasAta(int yas) {

        if (yas > 0 && yas <150)
            this.yas = yas;
        else

        System.out.println("hatalı yaş");


    }

    int yasVer() {  //YAŞ VER METODU İLE YAŞA ULAŞMAYI SAĞLADIK
        return this.yas;

    }

    void setSoyad(String soyad) {  // SET SOYAD PROGRAMDA SOYAD YAZDIRIR
        if (soyad.length() < 25)
            this.soyad = soyad;
        else
            System.out.println("hatalı soyad");

    }

    void setAd(String ad) {
        if (ad.length() < 25)
            this.ad = ad;
        else
            System.out.println("hatalı ad");

    }

    String getAd() {
        return this.ad;

    }

    String getSoyad() {
       return this.soyad;
    }  // SET LE YAZDIRIRIZ GET İLE DEĞERİ ALIRIZ MAİNE DÖNDÜRÜRÜZ
                                             // GET İLE DEĞERE ULAŞIYORUZ SET İLE YAZDIRIYORUZ



    @Override
    public String toString() {
        return "Kişi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
