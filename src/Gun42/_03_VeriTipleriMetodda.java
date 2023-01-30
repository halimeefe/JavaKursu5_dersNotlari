package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {


        //ilkel tip

        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi:"+sayi);//5 gelir


        //referans tip
        int []dizi={1,2,3,};
        diziSifirla(dizi);
        System.out.println("dizi:"+ Arrays.toString(dizi));//0,0,0

        //NESNE TİPLER
        String kelime="İSMET";
        kelimeSifirla(kelime);
        System.out.println("kelime:"+kelime); // ismet gelir



    }public static void  sayiArtir(int sayi){// ilkel değerlerin değeri gelir
        sayi++;
    } // ilkel değerlerin kendi gelir yani 5
    public static void diziSifirla(int[]dizi)//referans değerlerin kendisi gelir yani 000 yani dizi1=dizi2 de olduğu gibi
    {
        dizi[0]=0;  dizi[1]=0;  dizi[2]=0;
    }

    public static void kelimeSifirla(String kelime){//  Stringler referans tip olarak kendini tanıtır ama
        kelime="";                                       // ilkel tip gibi davranır yani int sayı gibi değeri gelir yani ismet


    }
    //ÖZET : TEMEL FARK
    //1 - İLKEL TİPLER SADECE 1 DEĞER SAKLARLAR , BU YÜZDEN METODLARA SADECE DEĞERİ GİDER.EŞİTLENDİĞİNDE SADECE DEĞER AKTARILIR
    // 2 - NESNE TİPLER İLKEL TİPTEN TEK FARKI NULL DEĞER ALABİLMELERİ , BU YÜZDEN İLKEL TİP GİBİ DAVRANIRLAR
    // 3 - REFERANS TİPLER METODA GÖNDERİLDİKLERİNDE KENDİLERİ GİDERLER.EŞİTLEMELERDE REFERANSLAR EŞİTLENİR.



}

