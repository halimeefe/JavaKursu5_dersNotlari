package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatc {
    public static void main(String[] args) {


        System.out.println("program çalışmaya başladı");


        try {// dene ,hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);


        }//hata olduğu zaman programı kırma
        catch (Exception ex)
        //ex isimli değişkende oluşan hataların bilgisi atanıyor
                //hata olduğunda yapılması istenenler buraya yazılıyor

        {
            System.out.println("hata oluştu, lütfen tekrar deneyiniz");
            System.out.println(" tüm hata mesajı:"+ex);
            System.out.println("hatanın açıklaması:"+ex.getMessage());
            //kendine hata mesajını kendine mail atabilirsin
            // log tutma :program nasıl çalışıyor , hata loglarını harddiske yazabilirsin
        }
        System.out.println("program bitti");

        try {
            // JAVA VE TOOLLARI ÇALIŞMAYA DEVAM ET
            //KONULARI ÖĞRENMEYE VE ÇALIŞMAYA DEVAM
            //ANLAMADIĞIN YER Mİ OLDU? KIRILMADAN DEVAM ET

        }catch (Exception ex){
            //HATANIN SEBEBİNİ ANLA
            //DERSE DAHA FAZLA ODAKLAN
            //GEREKEN VİDEOLARI İZLE
            // GRUP ÇALIŞMASI YAP
            //ÖĞREN VE KIRILMADAN DEVAM ET
            //UNUTMA SEN BİR SÖZ VERDİN ,DEVAM

        }

    }
}
