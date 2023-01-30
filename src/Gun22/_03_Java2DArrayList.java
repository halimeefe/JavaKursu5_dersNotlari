package Gun22;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {

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
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimyaNotlari);

        // ***SORU 1:
        //  DERS ADLARINI BİR ARRAYLİST TEN ALARAK
        //HER DERSİN ADINI VE NOTLARINI EKRANA YAZDIRIN
        // HER BİR SATIRA YAZDIRINIZ
        //MATEMATİK:40 50 60
        // FİZİK: 30 40
        // KİMYA: 70 80 90 100

        ArrayList<String> dersler = new ArrayList<>();//DERS ADLARINI BİR ARRAY LİSTE EKLİYORUZ
        dersler.add("matematik");
        dersler.add("fizik"); // ***DERSLERİN ADINI YAZDIRDIK
        dersler.add("kimya");

        for (int i = 0; i < notlarListesi.size(); i++) { // HER DERSİN ADINI SIRALADIK KAÇ SATIR OLDUĞUNU GÖSTERİR
            System.out.println(dersler.get(i) + ":");     //  VE OKUTTUK YANİ DERSLERİN İ İNCİ ELEMANINI AL DEDİK

            //********************NOTLARIN YAZILDIĞI KISIM AŞAĞİDAKİ KISIM************************//

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  //***TEK TEK NOTLAR YAZILIR
                System.out.print(notlarListesi.get(i).get(j) + "\t");

            }

        }
        // SORU 2:
        // KULLANICIDAN İSTEDİĞİ BİR DERSİN NOSUNU ALARAK (0-MAT,1-FİZ,2-KİM)
        //SADECE İSTEDİĞİ DERSE AİT NOTLARI BİR METHODDA YAZDIRINIZ

        System.out.println("*****************************************");
        Scanner oku = new Scanner(System.in);
        System.out.print("seçiminiz(0-mat,1-fiz,2-kim):");
        int dersNo = oku.nextInt();


        dersNotlariniYazdir(notlarListesi, dersNo);


    }public static void dersNotlariniYazdir(ArrayList< ArrayList< Integer> >notlarListesi,int dersNo){
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {// NOTLAR LİSTESİNİN DERS NOSUNUN SİZEINI AL DEMEK
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");// YANİ 1 GİRİNCE FİZİK DERSİNİN UZUNLUĞU OKUNACAK



        }// SORU 3:
        //YUKARIDA VERİLEN  DERSE AİT NOT ORTALAMASINI VE GEÇEN SAYISINI BİR METHODDA YAZDIRINIZ

        dersOrtVeGecenMiktariBul(notlarListesi,dersNo);

    }public static void dersOrtVeGecenMiktariBul(ArrayList<ArrayList<Integer>>notlarListesi,int dersNo){
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam=notlarListesi.get(dersNo).get(i);


        }int ort=toplam/notlarListesi.get(dersNo).size();
        int gecenMiktar=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>=ort)
                gecenMiktar++;

        }
        System.out.println("ort:"+ort);
        System.out.println("gecenMik:"+gecenMiktar);
        }
    }












































































