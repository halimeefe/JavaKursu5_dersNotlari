package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        //ArrayList Collection grubunun bir ÜYESİDİR
        //Array i sıralarken Arrays.sort u kullandığımız gibi
        // ArrayList i Collectıon methodları kullancaz.

        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar .add(5);
        sayilar.add(456);
        sayilar .add(45);
        sayilar .add(3);

        System.out.println("sayılar:"+sayilar);

        //sıralama işlemi
        Collections.sort(sayilar);// ARRAYLİST LERİ KÜÇÜKTEN BÜYÜĞE SIRALAR************COLLECTİONS SORT ****************
        System.out.println("sayılar:"+sayilar);//                              ********KÜÇÜKTEN BÜYÜĞE***********

        //tersine çevir
        Collections.reverse(sayilar);   // SONDAN BAŞA TERSİNE SIRALAR****************REVERSE(SAYILAR)****************
        System.out.println("sayılar:"+sayilar);                      //*************SONDAN BAŞA TERSİNE SIRA***********

        // max ve min eleman bulma
        System.out.println("max:"+Collections.max(sayilar));// EN BÜYÜK ELEMANI ALIR*******COLLECTİONS.MAX*************
        System.out.println("min:"+Collections.min(sayilar));// EN KÜÇÜK ELEMANI ALIR*******COLLECTİONS.MİN*************

        //Bütün elemanları set etme
        Collections.fill(sayilar,0);// BÜTÜN ELEMANLARI 0' A ÇEVİRİR*******************COLLECTİONS.FİLL*****************
        System.out.println("sayılar:"+sayilar);                    //******BÜTÜN ELEMANLARI İSTEDİĞİMİZ RAKAMA ÇEVİRİR**//

        //replace
        Collections.replaceAll(sayilar,0,5);//0 LARA 5 ATADI ,*********************COLLECTİONS.REPLACEALL***************
        System.out.println("sayılar:"+sayilar);//,**************************ESKİ DEĞERİ YENİSİYLE DEĞİŞTİRDİ************

        //tanımlarken değer atama
        int[]dizi={2,3,4,5};    // önceden böyle değer atıyoduk
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(3,4,5,6)); //*****ARRAYLİST TE ASLİST İLE ATAMA YAPARIZ****
        System.out.println("liste:"+liste);//******************************************ARRAYS.ASLİST ******************

        ArrayList<String>strliste=new ArrayList<>(Arrays.asList("AHMET","MEHMET","BÜŞRA","ROMAN")); //STRİNG ATAMA***ARRAYS.ASLİST**
        System.out.println("strliste:"+strliste);

        ArrayList<Integer>liste2=new ArrayList<>();//2.YÖNTEM İNTEGER YADA STRİNG ATAMA*****************COLLECTIONS.ADALL İLEDE ATAMA***
        Collections.addAll(liste2,2,3,4,5,6,67);    //2. yöntem dizi atama (içindeki elemanları bozmadan)

        // DİZİYİ DİREK ARRAYLİST E NASIL ATARIM

        Integer[]dizi2={2,3,4,5};// DİZİYİ VEREREK ATAMA ŞEKLİ
        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(dizi2));//**********DİZİYİ ARRAYLİSTE ATAMA****ARRAYS.ASLİST İLE
        System.out.println("liste:"+list3);                            // ********DİZİDE AYNI TİPTE OLMASI GEREKİYOR*******//
                                                                       // ********INTEGER İSE INTEGER ,STRİNG İSE STRİNG***//
     //********* INT: SADECE SAYI SAKLAYABİLEN BASİT PRİMİTİVE TİP TİR.
      //********* INTEGER : INTEGER HEM SAYI SAKLAR HEMDE KENDİNE ÖZGÜ METHODLARI VAR MESELA,
      //*********PARSEINT,INTVALUE, GETINTEGER GİBİ
    }
}
