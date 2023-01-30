package Gun04;

public class _14_Soru {
    public static void main(String[] args) {

        //SORU 14 : DEGERİ 3.55F OLAN BİR FLOAT OLUŞTURUN VE FLOAT`I YAZDIRIN.

        String sayi1=" 1.3499999";
        String sayi2 ="2.19999999";
        float flsayi1 =Float.parseFloat(sayi1);
        float flsayi2 = Float.parseFloat(sayi2);
        float sonuc= flsayi1+flsayi2;
        System.out.println("sonuc ="+sonuc);
        /******************************************************************/


        float fatura1=1.80f;
        float fatura2=1.75f;

        float faturaToplam=fatura1+fatura2;
        System.out.println("float:"+faturaToplam);



    }
}
