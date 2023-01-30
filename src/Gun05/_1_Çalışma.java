package Gun05;

import javax.jws.soap.SOAPBinding;

public class _1_Çalışma {
    public static void main(String[] args) {

//        Bu bir yorum satırı başla demektir ctrl+/ basarsak sayfanın başına kendiliğinden yazılır.
        /* Çoklu yorum satırı tek yorum satırı için kullanırız ctrl+shift+/ basarsak sayfayya otomatik yazılır.*/

        System.out.println(" Merhaba Amerika"); // noktalı virgül emrim bitti komutu yerine getir demektir.

        System.out.println(" Merhaba Amerika"); // ln varsa yazdıktan sonra sonraki komutu alt satıra alır

        System.out.print(" Merhaba 1");
        System.out.print(" Merhaba 2"); // ln olmazsa alt alta yazılan komutu yan yana alır

        System.out.println();  // Bu şekilde boş parantezde bir şey yazmaz yeni satır açar

        System.out.println("Merhaba \n Dünya"); // \n  arada bu işaret varsa iki kelimeyi alta alta alir.


        // Soru : Pazartesi kelimesinin her bir harfini ayrı satırda yazdırınız.

        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");

        //    \n  -> yeni satır açıyor alt satıra geçiyor
        //    \t  -> sanki tab tuşuna basılmış gibi boşluk bırakır
        //    \b  -> back-space  bir karakter geri siler.
        //    \" ->  " tırnak yazmak için kullanılıyor
        //    \\  -> \ aralara ters slaç koymak için  yazılır
        //    \r  -> satır başına geri döner ve satırı silip tekrar baştan yazıyormuş gibi yapar.


        System.out.println(" Merhaba \t Amerika");

        System.out.println("Merhaba\bAmerika");

        System.out.println("Merhaba \" Amerika");

        System.out.println("Merhaba \\ Amerika");

        System.out.println("Merhaba \r Amerika");


        // Soru : Ekrana  " Hello " , " World  \ /" şeklinde yazdırınız.

        System.out.println(" \" Hello \" , \" World \\ /\"");


        // DEĞİŞKENLER : PROGRAMDA BİR VERİ SAKLAYACAKSAM ( SAYİ GİBİ ,SAYAC GİBİ,TOPLAM GİBİ )
        // BENİM BİLGİSAYARA NE KADAR YER İSTEDİĞİMİ BİR DE DEĞİŞKENİN ADINI  SÖYELMEMEM LAZIM.
        // İNT SAYİ -> INTEGER YANİ TAM SAYI

        int sayi; // HAFIZADA ( RAM ,GEÇİCİ HAFIZADA ) BANA İNT KADAR BİR YER AYIRIYOR.
        // BU AYRILAN YERİN ADI SAYİ TİPİDE İNT DİR.YANİ TAM SAYİ DİR.

        //  DEĞİŞKENLER : PROGRAM YAZILIRKEN İÇERİSİNDE BİR TAKIM DEĞERLERİ TUTAN VE KENDİNE AİT BİR TÜRÜ OLAN YAPIDIR.
        //  HER DEĞİŞKENİN BİR TÜRÜ VARDIR SAYI İÇİN AYRI KELİME İÇİN AYRI DIR.
        //  DEĞİŞKEN TANIMLAMANIN KURALLARI VARDIR.BU KURALLARA UYULMAZSA HATA VERİR.
        //  JAVAYA AİT KELİMELERİ BİZ KULLANAMAYIZ MESELA PUBLİC,PRİNT, STATİC GİBİ.
        //  ADLAR YA BİR HARF İLE BAŞLAMALI YADA $ SİMGESİ VEYA _ ALT TRE İLE BAŞLAYABİLİR.
        //  BÜYÜK KÜÇÜK HARFLE KOYULAN AYNI İSMİ FARKLI ALGILAR ÖRNEK SAYİ VE sayi
        //  VE AD İÇİNDE BOŞLUK BIRAKILMAZ
        //  DOĞRU ÖRNEKLER : sayilarinToplami
        //sayilarin_toplami
        //sayilarin_Toplami;
        //Toplam;
        //sayi;
        //_sayi;
        //$sayi;
        //sayi1;


        sayi = 5;
        System.out.println("sayi");   // bu şekilde yazarsak bize sayi yazısını verir.

        System.out.println(sayi);  // bu şekilde yazrsak bize 5 sayısını verir

        System.out.println("sayi =" + sayi); // bu şekilde sayı=5 yazar.Buradaki artı ilave et, yanına yaz anlamı verir.
        System.out.println("sayi =" + sayi);  // bu şekilde ln yi silip yazarsak  yine  aynı şekilde sayi=5 yazar.


        int kisaKenar = 5;
        int uzunKenar = 7;
        int cevre;


        cevre = kisaKenar + uzunKenar + kisaKenar + uzunKenar;
        System.out.println("cevresi =" + cevre);
        System.out.println("cevre = " + cevre); // so v ye basarsak otomatik parantezli kısım yazılı olarak gelir


        // kayan satırları düzeltmek için    ctrl+alt+l  ye basarsak hepsi düzelir.

        // *TAM SAYILARDA İNT,BYTE,SHORT,LONG KULLANIYORUZ
        // *ONDALIKLI SAYILARDA FLOAT VE DOUBLE KULLANIYORUZ,ÖRNEK 10,5 GİBİ
        // BYTE 127 İLE -128 ARASI
        // SHORT -32768 İLE 32767 ARASI
        //İNT -2147483648 İLE 2147489647 ARASI
        //LONG -9223372036854775808 İLE 9223372036854775807 GİBİ
        //* BUNLARIN HEPSİ İÇİN BİZ GENELDE İNT KULLANIYORUZ

        Byte byteDeger = 7;
        short shortDeger = 1645;
        int intDeger = 250000;
        long longDeger = 232323232323l; // altının kırmızı çizilmesinin sebebi bunu integer saydığı içindir ya kısalt
        //diyor yada bunu belirt sonuna l yaz demek istiyor örnek 2323232323l; gibi


        // ondalıklı sayilar
        double doubleDeger = 3.1425789125456487; // double deger 16 haneye kadar yazılabilir
        float floatDeger = 3.1454547f; // altının kırmızı olmasının sebebi burada float olduğunu belirtmemiz gerekiyor f
        //float noktadan sonra 7 hane duyarlıdır.


        // *genelde kullanacaklarımız double ve int olacak

        // *EĞER KELİME ATAYACAKSAK
        char basHarf = 'A';
        String isim = " Halime";

        System.out.println("isim = " + isim);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);



        // DEĞİŞKENLERİN MAX VE MİN DEĞERLERİ //
        byte byteMindeger = Byte.MIN_VALUE; // eşittir den sonra byte ın B sini büyük harf ile yazarsak minimum değeri
        //alabiliriz.
        byte byteMaxdeger = Byte.MAX_VALUE; // yine Byi büyük yazarsak  max değeri bize verir

        System.out.println("Byte.MIN_VALUE="+ Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE="+ Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);


        //SORU = İKİ KENARI TANIMLI OLARAK VERİLEN BİR
        // DİKDÖRGENİN ÇEVRESİNİ VE ALANINI BULUNUZ
        // CEVRE=A+B+A+B  ALAN= A*B


        // Soru = yarı çapı verilen bir dairenin cevresini ve alanını bulunuz.
        // alan= pi*r*r
        //cevre =2*pi*r
        //pi=3.14






















    }


}
