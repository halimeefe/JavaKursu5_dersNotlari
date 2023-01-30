package Gun27._03_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
        // 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Saati geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
        // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
        //    yazdırınız.

        Student.universiteKurallari(); // ÜNİVERSİTE KURALLARINI ÇAĞIRDIK
        System.out.println();// ARALARDA BOŞLUK OLMASI KARIŞMAMASI İÇİN SOUT YAZDIK


        Lesson ders1=new Lesson();// LİSTEYİ HAZIRLADIKTAN SONRA YENİ BİR DERS TİPİ TANIMLARIZ
        ders1.name="algoritma";
        ders1.saat=4;

        Lesson ders2=new Lesson();
        ders2.name="java";
        ders2.saat=4;

        Lesson ders3=new Lesson();
        ders3.name="test tools";
        ders3.saat=3;

        Student ogr1=new Student();// YENİ BİR STUDENT TANIMLARIZ 1 TANE OLDUĞU İÇİN ARAYLİST OLUŞTURMAYA GEREK YOK
        ogr1.name="İsmet";
        ogr1.maxSaat=10;

        ogr1.dersEkle(ders1);//DERS EKLE METODUNU ÇAĞIRDIK
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);


        ogr1.desleriYazdir();//DERSLERİ YAZDIR TRANSKRİPT METODUNU ÇAĞIRDIK




//
//        Static ve Static olmayan metodların farkı ve kullanım amacı
//                -STATIC metodlar
//        1)Başına static kelimesi getirilir
//        2)Nesneyi değil GENEL i yani tüm nesneleri kapsayan, yani nesne
//        bağımsız metodları nesne olusturmadan kullanmak için olusturulur.
//        3)Bu metdolara Nesne özelinde değil , TİP e ait metodlar oldugu için
//        TİP adı ile direk kullanılabilirler.
//        4)Buna uygun Java da var olan örnek static metodlar Math.random gibi
//        veya Integer.parseInt() gibi fonksiyonlardır.
//
//        -STATIC olmayan metodlar
//        1)Bu metdolar nesne özelinde çalışan metodlardır.
//        2)Nesne özelind enesneye ait değerlerle çalışmak zorunda olduğu için
//        mutlaka new ile nesne oluşturulup. Nesne değişkeni ile kullanılırlar.
//
//
//        Yani, nesne özelliklerine ihtiyaç duyarak çalışacak metodlar normal metodlardır.
//                nesne özelliklerine ihtiyaç duymayarak çalışacak metdoları geneli ilgilendirdiği için
//        TİP e ait olması gerektiğinden başına static koyularak direk TİP adı ile birlikte
//        kullanılırlar.



    }
}
