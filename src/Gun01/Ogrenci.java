package Gun01;

public class Ogrenci {

     String ad;
     String soyAd;
     int ıdNo;
     static int sayac=1;


     public Ogrenci(String ad, String soyAd, int ıdNo) {
          this.ad = ad;
          this.soyAd = soyAd;
          this.ıdNo =sayac++;
     }

     @Override
     public String toString() {
          return "Ogrenci{" +
                  "ad='" + ad + '\'' +
                  ", soyAd='" + soyAd + '\'' +
                  ", ıdNo=" + ıdNo +
                  '}';
     }
}
