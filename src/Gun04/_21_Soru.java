package Gun04;

public class _21_Soru {
    public static void main(String[] args) {
        //SORU 21: DEĞERİ -100 OLAN BİR SHORT OLUŞTURUN.SHORT`U YAZDIRIN.

        String deger1="200";
        String deger2="300";
        short srdeger1=Short.parseShort(deger1);
        short srdeger2=Short.parseShort(deger2);
        int sonuc= (short)srdeger1-srdeger2;
        System.out.println("sonuc="+sonuc);
        /***********************************************************/


        short sayi1= 20;
        short sayi2= 120;
        short durum=(short) (sayi1-sayi2);
        System.out.println("short:"+durum);







    }
}
