package Gun35._03_Polymorphısan;

import javax.jws.soap.SOAPBinding;

public class Kisi {

   private String ad;
   private String soyad;
   private  String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
       setAd(ad);
       setSoyad(soyad);
       setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void kimlikYaz(Kisi kisi)
    {
        System.out.println("\n**********KİMLİK BELGESİ*********");
        System.out.println("AD:"+kisi.getAd());
        System.out.println("SOYAD:"+kisi.getSoyad());
        System.out.println("GÖREVİ:"+kisi.getGorevi());

        if (kisi instanceof Ogrenci)
            System.out.println("şubesi:"+((Ogrenci)kisi).getSube());
        else
            if (kisi instanceof Calisan)
                System.out.println("departmanı:"+((Calisan)kisi).getDepartman());
    }
    //  ÖGRENCİ İLE CALIŞANIN ORTAK-- KİMLİK YAZ-- METODUNU KİŞİ İSİMLİ ORTAK BİR CLASSTA YAZDIK
    //SONRA MAİNDE **KİŞİ.KİMLİK YAZ** OGR VE KİMLİK YAZ CL DİYE ÇAĞIRDIK
}
