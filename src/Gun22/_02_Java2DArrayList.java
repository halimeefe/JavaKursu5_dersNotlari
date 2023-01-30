package Gun22;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi = 5; // **TEK BİR RAKAM TUTABİLEN BİR DEĞİŞKEN TİPİ
        int[] dizi = new int[20]; // **20 ADET SAYI SAKLAYABİLEN BİR DEĞİŞKEN,AMA UZUNLUK SABİT
        int[][] tablo = new int[20][2];//** 20*2 YANİ 40 ELEMAN SAKLAYABİLEN BİR DEĞİŞKEN VE SABİT UZUNLUKTA

        ArrayList<Integer> liste = new ArrayList<>();//**İSTENİLDİĞİ KADAR SAYI EKLENEBİLEN,UZUNLUĞU DEĞİŞKEN
        /*************************/

        // Diyelim bir sınıf var ve bu sınıfta20 kişi var ve bunların 3 dersi olsun
        //Öğrencilerin bu üç derse ait notlarını nasıl bir değişkende saklayabilirim.

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizikNotlari = new ArrayList<>();
        ArrayList<Integer> kimyaNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(30);
        fizikNotlari.add(40);

        kimyaNotlari.add(60);
        kimyaNotlari.add(70);
        kimyaNotlari.add(80);
        kimyaNotlari.add(90);

        //ARRAYLİST İN ARRAYLİST İ Nİ NASIL YAPARIM
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();//listelerin listesi
        notlarListesi.add(matNotlari);//*******************NOTLAR LİSTESİNE MAT NOTLARINI ATTIK*********
        notlarListesi.add(fizikNotlari);//******************NOTLAR LİSTESİNE FİZİK NOTLARINI ATTIK*************
        notlarListesi.add(kimyaNotlari);

        notlarListesi.get(0);// ->MAT.NOTLARI
        System.out.println(notlarListesi.get(0));// MAT NOTLARININ HEPSİNİ VERİR************

        int matBirNot = notlarListesi.get(0).get(0);// MAT.NOTLARININ İLKİNİ VERDİM// NOTLAR LİSTESİNİN 0 INCI ELEMANININ 0 INCISINI VERİR***İLKİNİ YANİ
        System.out.println(notlarListesi.get(0).get(0));//MAT.NOTLARININ İLKİNİ VERİR//  İKİ GET KULLANARAK LİSTENİN İÇİNDEKİ ELEMANIN ELEMANINI ALIRIZ

        System.out.println("notlar listesi:" + notlarListesi.get(0));// MAT.NOTLARI
        System.out.println("notlar listesi:" + notlarListesi.get(1));// FİZ.NOTLARI
        System.out.println("notlar listesi:" + notlarListesi.get(2));// KİM.NOTLARI

        //yukardakinin yerine bir for döngüsüsnü nasıl kullanırız
        for (int i = 0; i < notlarListesi.size(); i++) {      //***SİZE LENGTH YERİNE ARRAYLİSTTE KULLANDIĞIMIZ UZUNLUK
            System.out.println("notlarlistesi.get(" + i + ") =" + notlarListesi.get(i));
            //**SİZE KAÇ SATIR OLDUĞUNU VERİR


        }


         // ******************İKİ FORLA SATIR SUTUN YAZDIRMA YÖNTEMİ****************//

        for (int i = 0; i < notlarListesi.size(); i++) {//  i :satır  j :sutun

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  // BURADA HER BİR SATIRIN SİZE INI ALIYORUZ
                System.out.print(notlarListesi.get(i).get(j) + "\t");  // notlar [i][j]
            }
            System.out.println();


        }



            }

        }

































