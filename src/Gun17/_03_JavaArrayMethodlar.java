package Gun17;

import java.util.Arrays;

public class _03_JavaArrayMethodlar {
    public static void main(String[] args) {

        String[]isimler={"ahmet","zeynep","roman","yasin","cihan"};//
        //diziyi string olarak direkt yazdırır
        System.out.println("isimler="+ Arrays.toString(isimler));// indexlerle uğraşmadan direk stringleri
        // arrays.tostringle yazdırırız.

        //dizi sıralama
        Arrays.sort(isimler);// ALFABETİK SIRAYA GÖRE SIRALAR ÖNCE BUŞEKİLDE KOMUT YAZMALIYIZ
        System.out.println("isimler:"+Arrays.toString(isimler));//RAKAM OLSA RAKAMLARI SIRALAR

        // diziler eşit mi
        int[]a={1,8,3,54};
        int[]b={1,8,3,54};
        int[]c={1,8,2,54};

        System.out.println("arrays.eguals(a,b:"+Arrays.equals(a,b));// true
        System.out.println("arrays.eguals(a,c:"+Arrays.equals(a,c));// false

        Arrays.sort(c);// sayı bazlı dizi sıralaması
        System.out.println("arrays tostring(c:"+Arrays.toString(c));// 1,2,8,54

        //CONTAİNS GİBİ ÇALIŞIR,VAR İSE POZİTİF BİR DEĞER DÖNDÜRÜR,YOK İSE NEGATİF
        System.out.println("arrays.binarysearch():"+Arrays.binarySearch(b,3));//-2 NEGATİF İSE RAKAM YOK DEMEK
        Arrays.sort(b);//ancak sıralanmış dizilerde doğru sonuç verir
        System.out.println("arrays.binarysearch():"+Arrays.binarySearch(b,3 ));//1 POZİTİF İSE RAKAM VAR DEMEK


        // BU KISIMDA EN ÇOK KULLANACAĞIMIZ KISIM
        //Arrays.sort(string)yada(int);*****************
        //Arrays.toString(isimler);***********












    }
}
