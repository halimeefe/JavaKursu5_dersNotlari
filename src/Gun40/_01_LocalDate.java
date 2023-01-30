package Gun40;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_LocalDate {
    public static void main(String[] args) {


        //LOCAL DATE SADECE GÜN AY YIL BİLGİSİNİ TUTAR.

     LocalDate tarih= LocalDate.now();// tarihi alıyoruz // programı ne zaman çaıştırırsak bilgiyi ozaman alıyor
       System.out.println("tarih:"+tarih);// burada yazdırıyoruz

       System.out.println("*********************************************");

        System.out.println("tarih.getYear:"+tarih.getYear());//yılı
       System.out.println("***********************************************");

        System.out.println("tarih.getMont:"+tarih.getMonth());   //ayı yazılı olarak veriyor
       System.out.println("*************************************************");

        System.out.println("tarih.getmontValue:"+tarih.getMonthValue());// kaçıncı ay
       System.out.println("***************************************************");

        System.out.println("tarh.getDayofMont:"+tarih.getDayOfMonth()); //ayın kaçıncı günü
       System.out.println("*****************************************************");

        System.out.println("tarih.getDayOfWeek:"+tarih.getDayOfWeek());// haftanın hangi günü
       System.out.println("*****************************************************");

        System.out.println("getdayofweek.getValue:"+tarih.getDayOfWeek().getValue());// haftanın kaçıncı günü
       System.out.println("*******************************************************");

        System.out.println("tarih.getDayOfYear:"+tarih.getDayOfYear());// yılın kaçıncı günü
       System.out.println("**********************************************************");

        //kendisindeki hazır formatlara bakalım

        System.out.println("ISO DATE:"+tarih.format(DateTimeFormatter.ISO_DATE));//uluslararası  formatta tarih yazılış şekli
       System.out.println("********************************************************");

        System.out.println("SHORT:"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));// windowsun kendi formatıyla tarih sıraladı
       System.out.println("**********************************************************");

        System.out.println("MEDIUM:"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));// 11 ocak 2023 verdi
       System.out.println("*************************************************************");

        System.out.println("LONG:"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));// 11 ocak 2023 çarşamba
       System.out.println("***************************************************************");

        System.out.println("FULL:"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));//11 ocak 2023 çarşamba


        System.out.println("\n*********************");
        //LOCALDE ALDIĞIM TARİHİ İSTEDİĞİM ÜLKENİN FORMATINA GÖRE, DİLİNE GÖRE NASIL GÖSTERİRİM
        //ÖRNEĞİN LOCALDEKİ TARİHİ ALMANYA YA NASIL GÖSTERİRİZ

        System.out.println("FULL ALMANYA GÖSTERİMİ:\n"+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));// TARİHİN ALMANYAYA GÖRE GÖSTERİMİ

        //LOKALİZASYON TANIMLAMASI
        //EN-US : BİRİNCİSİ DİLİ,İKİNCİSİ ÜLKEYİ TEMSİL EDİYOR.AMERİKAN İNGİLİZCESİ
        //EN -UK :UK İNGİLİZCESİ
        //FR -CA : KANADA FRANSIZCASI
        //EN -CA
        // TR - TR

        System.out.println("***************************************");

        Locale[]  kullanilabilenLokaller =Locale.getAvailableLocales();//KULLANILABİLEN LOKALLERE BAKMIŞ OLDUK

        for (Locale l:kullanilabilenLokaller){// ÇİNE GÖRE ZN GÖSTERİMİ ÇIKAR
            if (l.getDisplayCountry().toLowerCase().contains("chi")) {


                System.out.print("dil:" + l.getDisplayLanguage());//DİL
                System.out.print(", ülke:" + l.getDisplayCountry());//ÜLKE
                System.out.print("-  " + l.getCountry());//KÜÇÜK KODU CN
                System.out.println("-  " + l.getLanguage());//KÜÇÜK KODU ZH
            }



        }
        Locale lokalCince =new Locale("ZH","CN");// ÇİNCE OLARAK TARİHİ YAZDIRDIK
        System.out.println("full çince gösterimi:\n"+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("\n****************istediğim formatta gösterim****************");

        //istediğim formatta gösterim
        System.out.println("tarih:"+tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy:"+tarih.format(ozelFormat1));

        System.out.println("************************************");
        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih özelformat2:"+tarih.format(ozelFormat2));

        System.out.println("************************************");
        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("özel format 3:"+tarih.format(ozelFormat3));


        System.out.println("******************************");

        System.out.println("ozelformat3 değiştir:"+tarih.format(ozelFormat3.withLocale(Locale.UK)));

        System.out.println("******************************************");

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("ÖZ.FORM.4:"+tarih.format(ozelFormat4));

        System.out.println("************************************");

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("oz5:"+ tarih.format(oz5));

        System.out.println("*****************************");
        //KENDİMİZ BİR TARİHİ NASIL SET EDEBİLİRİZ OL
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);// enum gibi tarihi
        System.out.println("tarih1:"+tarih1);

        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);// enum gibi istediğimiz tarihi yazdırdık
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));









    }




}
