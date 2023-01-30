package Gun30._02_FinalVariables.Ornek_2;

import java.util.Scanner;

public class SabitlerMain {
    public static void main(String[] args) {
        int gun ;
        int saat ;
        int dakika ;

        Scanner oku = new Scanner(System.in);
        System.out.print("Gun:");
        gun = oku.nextInt();
        System.out.print("Saat:");
        saat = oku.nextInt();
        System.out.print("DAKİKA:");
        dakika = oku.nextInt();

        int toplamSaniye =
                gun// kullanıcı gün sayısını girer
                 * Sabitler.birGundekiSaatSayisi //girilen gün ile 24 çarpılır
                 * Sabitler.birSaattekiDakSayisi//girilen gün ile 60çarpılır
                 * Sabitler.birDakikadakiSaniyeSayisi//girilen gün ile 60 çarpılır
                 +      //ve toplam saniye bulunur
                 saat
                 * Sabitler.birSaattekiDakSayisi//kullanıcının girdiği saat ile 60 çarpılır
                 * Sabitler.birDakikadakiSaniyeSayisi// kul.girdiği saat ile 60saniye çarpılır
                 +// VE VERİLEN SAAT SANİYEYE ÇEVRİLİR
                 dakika
                 * Sabitler.birDakikadakiSaniyeSayisi;//kullanıcın girdiği dakika ile 60 saniye çarpılır
                 // VERİLEN DAKİKA SANİYEYE ÇEVRİLİR
        System.out.println("toplam saniye:"+toplamSaniye);//1.yöntem mainde yapılan şekil

        //2.yöntem
        System.out.println("toplam saniye:"+Sabitler.hesapla(gun,saat,dakika));//2.yöntem clasta metod olrak yapıldı ve
                                                                               //sout mainde yazılıp çağrıldı


    }
}
