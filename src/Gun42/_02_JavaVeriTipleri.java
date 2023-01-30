package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {





        //ilkel tipler,primitive tipler:short ,byte,long,float,double,boolean

        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2;//sayi1=10 //eşitlersen değerler atanır ama hücreleri kendi hücreleri

        sayi1=34; // AMA BURADA TEKRAR DEĞİŞTİ VE 34 OLDU
        sayi2=45; // BURADA SAYI2 45 OLARAK YENİLENDİ

        System.out.println("sayı1:"+sayi1); // 34
        System.out.println("sayı2="+sayi2);  // 45 // EŞİTLESEKTE DEĞERLERİ ATANIR KENDİ HÜCRELERİ AYNI KALIR


        //referans tipler :claslar ,diziler ,arrayler ,nesneler
        int[]dizi1={1,2,3,4};
        int[]dizi2={5,6};
        System.out.println("dizi1:"+dizi1);
        System.out.println("dizi2:"+dizi2);

        dizi1=dizi2;
        System.out.println("dizi1:"+ Arrays.toString(dizi1));  //  DİZİ1 İ DİZİ2 YE EŞİTLEDİK 5,6 OLUR
        System.out.println("dizi2:"+Arrays.toString(dizi2));   // DİZİ2 ZATEN 5,6

        dizi1=dizi2;
        System.out.println("dizi1:"+Arrays.toString(dizi1));//5,6
        System.out.println("dizi2:"+Arrays.toString(dizi2));//5,6

        dizi1[0]=67;
        System.out.println("dizi1:"+Arrays.toString(dizi1));//67,6 // DİZİ1 VE DİZİ2 DEKİ 5 67 OLDU
        System.out.println("dizi2:"+Arrays.toString(dizi2));//67,6 // YANİ ADRESLER AYNI OLDUĞU İÇİN

        dizi2[0]=55;
        System.out.println("dizi1:"+Arrays.toString(dizi1));//55,6  // DİZİ2 DEKİ 67 Yİ 55 YAPTIK
        System.out.println("dizi2:"+Arrays.toString(dizi2));//55,6  // DİZİ1 DE 55 OLDU VE 55,6 YAZDI
                                                            // ÇÜNKÜ ADRESLER AYNI İSİMLER FARKLI OLSA BİLE



        //NESNE TİPLER :NULL ALABİLEN İLKEL TİPLER
        //STRİNG ,INTEGER ,DOUBLE ,LONG // NESNE TİPLER DİR AMA İLKEL DAVRANIRLAR

        String ad1="mehmet";
        String ad2="ismet";
        //REFERANS TİP AMA DAVRANIŞI İLKEL

        ad1=ad2;
        System.out.println("ad1:"+ad1);//ismet // kutucukları yine farklı
        System.out.println("ad2:"+ad2);//ismet // kutucukları yine farklı

       ad1="ali";
        System.out.println("ad1="+ad1);//ali
        System.out.println("ad2:"+ad2);//ismet














    }
}
