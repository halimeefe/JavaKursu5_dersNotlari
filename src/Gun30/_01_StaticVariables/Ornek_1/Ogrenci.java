package Gun30._01_StaticVariables.Ornek_1;

public class Ogrenci {
    String ad;

    String soyad;
    static String okulAd="yıldırım ilkokulu";// static sen bir tanesin herkese aitsin demek

    public Ogrenci(String ad,  String soyad) {

        this.ad = ad;
        this.soyad=soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }

// sen bitanesin
    //hepsi için geçerli tek bir eleman
    //tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için static kullanıyoruz
    //static=sen bitanesin demek
    //static varsa hafızadan tasarruf sağlar
    //hepsine atanır,tek olarak hafızada bulunur
    //tipin,sınıfın,isınıfın değişkeni oldu




}
