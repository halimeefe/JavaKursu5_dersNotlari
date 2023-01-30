package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        //ARRAY**ARRAY**ARRAY



        int ogrNot;// 1 tane not saklar

        // 50 kişi varsa
        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        //.....
        //....
        //.....
        int ogrNot50;// bu şekilde çok uzun olacağı için

        // bana bir tanımlamada BİRDEN FAZLA değer tutan bir değişkene ihtiyacım var;
        // Çözüm;
        int ogrNo=20;
        int[]notlar  =new int[50];// 50 tane int saklayabilen notlar isimli değişken

        notlar[0]=75;// ****sıfırıncı kutudaki elemana 75 atadık
        notlar[1]=88;// ***** birinci kutudaki elemana 88 atadık
        //...
        //...
        notlar[49]= 95;// en son eleman toplam eleman sayısı-1 ,length-1 dir böyle 0 - 49 index dir.

        System.out.println("notlar[0]="+notlar[0]); //***SIFIRINCI ELEMANINI VERİR

        System.out.println("notlar:"+notlar[0]);
        System.out.println("notlar boyutu:"+notlar.length);// 50 yani toplam eleman sayısını yani boyutunu  verir.
        //dizinin eleman sayısını verir.


        // dizi nasıl okutulur
        Scanner oku=new Scanner(System.in);
        for (int i=0; i< notlar.length;i++) {// FOR LA YAPIYORUZ ÇÜNKÜ BAŞI SONU BELLİ ARTIŞ ŞEKLİ BELLİ
            System.out.print(" Notu giriniz:");
            notlar[i] = oku.nextInt();//SIFIRINCI KUTU,1.KUTU,2.KUTU,3.KUTU GİBİ OKU HEPSİNİ DEMEK

        }//***************DİZİYİ YAZDIRMA KISMI*********************//

        for ( int i=0; i<notlar.length;i++)// NOTLAR YERİNE DİZİ.LENGTH YAZABİLİRİZ
        {
            System.out.println(notlar[i]);// i ->0,1,2,3,4,5,....49// notları yaz demek aynı charAt gibi çalışır
        }




    }
}
