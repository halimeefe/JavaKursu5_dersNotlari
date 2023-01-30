package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duratıon {
    public static void main(String[] args) {


        //DURATİON: HEM LOCALTİME HEM DE LOCALDATETİME ARASINDAKİ FARKI VERİR

        LocalTime dersBaslangic= LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);

        Duration GunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("Günlük ders süresi:"+GunlukDersSuresi);

        System.out.println("tohours:"+GunlukDersSuresi.toHours());// farkın toplam saat hali
        System.out.println("tominutes:"+GunlukDersSuresi.toMinutes());// farkın toplam dakika halini
        System.out.println("tomillis:"+GunlukDersSuresi.toMillis());// farkın toplam milisaniye hali

        //LOCALDATE TİME ***2 TARİH-SAAT ARASINMDAKİ FARK***

        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();//bugün

        Duration farkZaman=Duration.between(from,to);
        System.out.println("fark zaman:"+farkZaman);
        System.out.println("farkzaman.todays:"+farkZaman.toDays());// farkın toplam günü
        System.out.println("fark zaman.tohours:"+farkZaman.toHours());// farkın toplam saati
        System.out.println("fark zaman.toMınutes:"+farkZaman.toMinutes());//farkın toplam dakıkası



                // 1000-milsaniye
               // 100000 mikro saniye
              // 1000000 nano saniye


    }
}
