package Gun04;

public class _19_Soru {
    public static void main(String[] args) {

        //SORU 19: DEĞERİ 12 OLAN BİR SHORT OLUŞTURUN VE SHORT`U YAZDIRIN.


        String sayi1="10";
        String sayi2="2";
        short ssayi1=Short.parseShort(sayi1);
        short ssayi2=Short.parseShort(sayi2);
        int sonuc =(short)ssayi1+ssayi2;
        System.out.println("sonuc="+sonuc);

        /*********************************************/

        short deger1= 12;
        short deger2=0;
        short toplam=(short)(deger1+deger2);
        System.out.println("short:"+toplam);




    }
}
