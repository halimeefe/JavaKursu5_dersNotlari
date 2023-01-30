package Gun41;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {


        // PERIOD 2 TARİH ARASINDAKİ FARKI GÖSTERİR
        //LOCALEDATE LER İÇİN KULLANILIR

       LocalDate dogumTarihi=LocalDate.of(1979,10,20);
       LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,bugun);
        System.out.println("fark:"+fark);

        System.out.println("fark.getyears:"+fark.getYears());
        System.out.println("fark.getmonths:"+fark.getMonths());
        System.out.println("fark.getdays:"+fark.getDays());

        System.out.println(fark.getYears()+"yaşındasınız");

        //*************************************************//

        Period period3Ay=Period.ofMonths(3);
        Period period3Gun=Period.ofDays(3);

        System.out.println("period3gun:"+period3Gun);
        System.out.println("period3ay:"+period3Ay);

        LocalDate ucgunSonra= bugun.plus(period3Gun);
        System.out.println("ucgun sonra:"+ucgunSonra);

        LocalDate ucAySonra=bugun.plus(period3Ay);
        System.out.println("üç ay sonra:"+ucAySonra);

        //******************************************************//

        //kursun bitiş tarihini bulunuz

        LocalDate kursBaslangic=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursBaslangic.plus(kursSure);

        System.out.println("kursbitiş:"+kursBitis);
        System.out.println("getdayofweek:"+kursBitis.getDayOfWeek());

        //kursun bitmesine ne kadar süre kaldı

        Period neKadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("ne kadar sure kaldı:"+neKadarSureKaldi);

        //kurs ne kadar süredir devam ediyor:
        Period suAnaKadarDevamSuresi=Period.between(kursBaslangic,bugun);
        System.out.println("şuanakadardevamsüresi:"+suAnaKadarDevamSuresi);







    }
}
