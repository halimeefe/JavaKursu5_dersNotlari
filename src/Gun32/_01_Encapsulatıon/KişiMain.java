package Gun32._01_Encapsulatıon;

public class KişiMain {
    public static void main(String[] args) {


        Kişi kisi1=new Kişi();
        kisi1.setAd("ismet");
        kisi1.setSoyad("temur");
        kisi1.yasAta(-25);

        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());

        System.out.println("kişi1="+kisi1);

        //değişkene direk erişimi kapatıp
        //bir metod ile korumalı veri gönderme ve alma
        //işlemine ENCAPSULATION denir.
    }
}
