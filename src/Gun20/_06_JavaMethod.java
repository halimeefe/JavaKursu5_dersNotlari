package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {


        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul("ismet",s1, s2);
        int sonuc2 = toplamBul("mehmet",s1, s2, s3);
        int sonuc3 = toplamBul("ali",s1, s2, s3, s4);
        //parametreler aynı tip sadece miktarları farklı
        // bu tip durumlar için bir kolaylık sağlanmış.

        System.out.println("sonuç1:"+sonuc1);// PUBLİC METODDAN SONRA KONSOLDA GÖRMEK İÇİN BURAYA YAZDIRIRIZ
        System.out.println("sonuç2:"+sonuc2);
        System.out.println("sonuç3:"+sonuc3);

        //...ile ilgili 2 kural var
        //1-Bir metodda parametre olarak sadece 1 tane olabilir
        //2-Her zaman son parametre  olmalı
        // gelen kaç sayı olursa olsunhepsini al dizi şeklinde metoda al
    }

    public static int toplamBul(String isim ,int...sayilar) {// ... 3 NOKTA KOYARIZ kaç sayı gelirse gelsin onları dizi şeklinde alıyor
        int toplam=0;                                          // SIRADAN EŞLEŞTİRİR KALANLARIN HEPSİNİ EN SONDAKİ İNT SAYILARA ATAR
        System.out.println("isim:"+isim);                      // BU DİZİ HALİNE GETİRİR KARIŞIK TİPLERİ DE SIRALAR

        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];

        }

        return toplam;
    }

    }

