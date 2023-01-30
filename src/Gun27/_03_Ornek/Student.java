package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();// ÖĞRENCİNİN DERSLERİNİ BURADA BİRİKTİRİYORUZ VE DERS SAATLERİNİ LESSON LİSTESİNDE,
                                                     //KENDİ OLUŞTURDUĞUMUZ CLASTA LİSTEYE BİRDEN FAZLA NESNE TOPLAYABİLİRİZ

    public void dersEkle(Lesson ders) {// propertisleri kullandiği için normal metoddur


        int suAnToplamSaat = 0;    //ÖĞRENCİNİN MAX 10 KREDİSİ VAR VE BAŞLANGIÇTA DERS SAATİ 0 OLUR
        for (Lesson d : dersleri)  // FOREACH İLE İF ŞARTINDAN SONRA MAX SAAT DOLMADIYSA BURADA EKLEME YAPILIR
            suAnToplamSaat += d.saat;

        if (suAnToplamSaat + ders.saat <= maxSaat)// EĞER TOPLAM SAATİ YENİ GELENDE GEÇMİYOSA LİSTEYE EKLE  DEMEKTİR
            dersleri.add(ders);  // BURADA DERSLERİ EKLEDİK LİSTEYE VE BU METODU MAİNDE KULLANDIK**İF ŞARTI DOĞRUYSA LİSTEYE EKLER**
        else
            System.out.println(ders.name + ":kredi sınırı aşıldı");

    }

    public void desleriYazdir() {
        System.out.println("\n***Transkript");
        System.out.println("SAYIN:" + name);
        System.out.println("aldığınız dersler aşağıdadır");

        for (Lesson d : dersleri)  // ÖĞRENCİNİN DERSLERİ LESSON CİNSİNDEN DERSLERİ LİSTESİNDE SAKLANIYOR BURDA SIRALARIZ
            System.out.println(d.name + " " + d. saat);


    }

    public static void universiteKurallari() {    //ÜNİVERSİTE KURALLARI NI METODLAŞTIRDIK
        System.out.println("Kural1 : Kahvaltı yapmadan derse gelme");
        System.out.println("Kural2 : Uykunu mutlaka al, erken yat");
        System.out.println("Kural3 : Herzaman dinç dinamik ol");
        System.out.println("Kural4 : Başta verdiğini kararı UNUTMA!");
        System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");

    }
}
