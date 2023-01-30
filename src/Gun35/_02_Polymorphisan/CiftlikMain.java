package Gun35._02_Polymorphisan;

import static Gun35._02_Polymorphisan.Hayvan.hayvanSesi;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("KARABAŞ");
       // kopek1.ses();// havladi
       // kopek1.kokladi();//kokladı

        Kedi kedi1=new Kedi("kopuk");
       // kedi1.ses();//miyavladı
       // kedi1.tirmaladi();//tırmaladı

       // kediSesi(kedi1);
       // kopekSesi(kopek1);

        hayvanSesi(kopek1);    //HAVLADI
        hayvanSesi(kedi1);     //MİYAVLADI
        //***********************************//

        //referans tipi  //nesne tipi
        Hayvan hayvan1=new Hayvan("ÖRDEK");//HAYVANLARDAN 1 HAYVAN
       Hayvan hayvan2=new Kopek("KANGAL");// HAYVANKLARDAN 1 KÖPEK
        Hayvan hayvan3=new Kedi("boncuk");// HAYVANLARDAN 1 KEDİ
        System.out.println("-----------------------------");

        hayvan2.ses();// havladı
        hayvan1.ses();// ses çıkardı
        hayvan3.ses(); // miyavladı

        // REFERANS TİPİ HAYVAN NESNE TİPİ ÖRDEK KÖPEK VE KEDİ

        // köpekte olsa hayvan referansı sebeiyle metodlar kısıtlı
        //peki bu hayvanı köpek formuna nasıl getiririm nasıl ortaya çıkartırım
        //tip dönüşümü acaba işe yarar mı, evet tip dönüşümü yaparsak köpek hayvan clasındaki diğer metodlarada ulaşır
        // kokladı metodunu artık kullanabilir

        ((Kopek)hayvan2).kokladi();// artık diğer metodları kullanabilirim  // tip dönüşümünü bu şekilde yaptık

        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yara mı
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

    }
   // public static void kopekSesi(Kopek kopek)
    {
   //     kopek.ses();
    }// BURADA KÖPEK SESİ İÇİN METOD HAZIRLADIK VE FONKSİYONA GÖNDERDİK


   // public static void kediSesi(Kedi kedi)
    {
   //     kedi.ses();
    }// BURADADA KEDİ SESİ İÇİN FONKSİYONA METOD GÖNDERDİK

    public static void hayvanSesi(Hayvan hayvan) // HAYVAN CLASINDAN  HAYVAN SESİ GÖNDERDİK YUKARIDA PARANTEZ İÇİNE KÖPEK YAZDIK
            // BÖYLECE HAVLADI ÇIKTI       // MİRAS ALDIĞI SINIFTAN METODU ÇAĞIRDIK
    {
        hayvan.ses();//BURAYA HEM KEDİ GELİYOR HEM KÖPEKGELİYOR
                    // BURAYA HANGİ CLASTAN GELDİĞİNİ KÖPEKMİ YADA KEDİMİ OLDUĞUNU
                   //İNSTANCE OF KULLANARAK BİR CLASIN NERDEN GELDİĞİNİ BU ŞEKİLDE BULABİLİRİZ

                                    //İNSTANCE OF ÖRNEĞİ DEMEK YANİ HAYVAN KÖPEK ÖRNEĞİ Mİ DEMEK
        if (hayvan instanceof Kopek)// instanceof bir clasın kim olduğunu bulma yöntemi
            ((Kopek)hayvan).kokladi();//yani hayvan aslında Köpek mi

        if (hayvan instanceof Kedi)  //hayvan aslında kedi mi
            ((Kedi)hayvan).tirmaladi();// YANİ KÖPEKSE KOKLASIN KEDİYSE TIRMALASIN

        // İNSTEANCE OF SENİN KAYNAĞIN KİM DEMEK YANİ ÖRNEĞİN DEMEK


    }
}
//YOL HARİTAMIZ
//1- ALGORİTMA
//2-JAVA CORE  -KALAN TOPLAM SÜRE 8 GÜN
// 4 KONU KALDI
// OOP 3.KONU
// OOP 4 .KONU
// 1 - 2 GÜN OOP ÖRNEK ÇÖZÜLCEK
// 3 GÜN TARİH VE ZAMAN VE HATA YÖNETİMİ KONULARI
// BİTTİKTEN SONRA OCA SINAV SORULARI ÇÖZÜLECEK 4 GÜN BOYUNCA JAVA TEKRAR OLCAK
// 4 GÜN GİTHUB -SRC GÖNDERMENİN GÜZEL HALİ KOD PAYLAŞIMI VE ORTAK ÇALIŞMA
// TESTİNG TOOLLARA BAŞLICAZ
// TESTİNG TOOLAR 3 AY SÜRECEK

// SELENYUM WEBDRİVER****
//TESTNG*********
//CUCUMBER******
//DB TESTİNG****
//API TESTİNG***
//JENKİNS ****
// SQL********



