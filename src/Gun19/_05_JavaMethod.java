package Gun19;

public class _05_JavaMethod {

    //BURAYA METODLAR YAZILABİLİR


    public static void main(String[] args) {//MAİN METODU ANA METODDUR.DİĞER METODLARI BURADAN ÇAĞIRCAZ
        Math.max(5,6);//BİR ŞEYLER VERİLMİŞ ,GERİYE DEĞER ALINIYOR
        Math.random();//VERİ ALMAZ SADECE VERİR

        //
        merhabaYaz();//math random();GİBİDİR SADECE YAZDIRIR
        merhabaYaz();//kullanımı kolay çağırması kolay tekrar tekrar kullanılabilir
        merhabaYaz();
        merhabaYaz();
        merhabaYazIsme("ismet");// math.abs(-10)

        cokMerhabaYaz(5);// METODU MAİN KISMINDAN ÇAĞIRIRIZ YOKSA ÇALIŞMAZ


    }
    public static void merhabaYaz() {
        System.out.println("merhaba dünya");
        System.out.println("merhaba dünya");
    }


    public static void merhabaYazIsme(String isim){// parametresi String isim dir
        System.out.println(isim+" merhaba" );

    }public static void cokMerhabaYaz(int miktar){

        for (int i = 0; i < miktar; i++) {
            System.out.println("merhaba");

        }
    }
}
