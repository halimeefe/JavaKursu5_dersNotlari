package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_LocalTime {
    public static void main(String[] args) {

        // LOCALTİME :TARİH BİLGİSİ İÇERMEZ SADECE SAAT ,DAK,SANİYE,NANO SAAT



        LocalTime saat=LocalTime.now();
        System.out.println("saat:"+saat);// şuanki saati veriyor
        System.out.println("**************************************");

        System.out.println("saat getohour:"+saat.getHour());// saati verdi
        System.out.println("****************************************");

        System.out.println("saat.getminute:"+saat.getMinute());//dakikayı verdi
        System.out.println("*********************************************");

        System.out.println("saat.getsecond:"+saat.getSecond());// saniyeyi verdi
        System.out.println("************************************************");

        System.out.println("saat. getNano:"+saat.getNano());// saniyenin milyarda birini verdi
        System.out.println("**************************************************");

        //kendimize özel format

        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");// saati pm ilave ederek veriyor
        System.out.println("saat hh:mm a:"+saat.format(of1));
        System.out.println("*******************************************************");

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");//saati 19:25
        System.out.println("saat kk:mm:"+saat.format(of2));
        System.out.println("*******************************************************");

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");//19:25
        System.out.println("satt k:mm:"+saat.format(of3));
        System.out.println("*******************************************************");

        //****************************************//
        LocalTime saat1=LocalTime.of(7,34,45);//saat dakika ve saniyesini  yazdırdık 7:34 olarak yazdırdı
        System.out.println("saat1 k:mm:"+saat1.format(of3));//7:34 gösterdi
    }
}
