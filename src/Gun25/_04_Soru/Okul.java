package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {


        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız


        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci>snf=new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            Ogrenci ogr =new Ogrenci(); //ÖĞRENCİYİ TANIMLADIK

            System.out.print("OKUL NO:");ogr.okulNo=okuInt.nextInt();
            System.out.print(" TAM adı:");ogr.tamAdi=okuStr.nextLine();
            System.out.print("NOTU:");ogr.Notu=okuInt.nextInt();

            snf.add(ogr);  // burada toplayıp arrayliste yönlendiririz

        }
        bilgileriYazdir(snf);
        ortalamaYaz(snf);

    }
    public static void bilgileriYazdir(ArrayList<Ogrenci> snf){
        for (Ogrenci ogr: snf){
            System.out.println("öğrenci okul no:"+ogr.okulNo);// foreach ile bilgilerin herbirini yazdırırız
            System.out.println(" öğrenci tam adı:"+ogr.tamAdi);
            System.out.println(" öğrenci notu:"+ogr.Notu);
        }


    }
    public static void ortalamaYaz(ArrayList<Ogrenci>snf){
        // SINIFIN TİPİ ARRAYLİST ÖĞRENCİ
          int toplam=0;
       for (Ogrenci ogr: snf){// bilgileri foreach ten alırız
           toplam=toplam+ogr.Notu;// ORTALAMAYI BULMAK İÇİN NOTLARIN HEPSİNİ TOPLARIZ
        }

        System.out.println("ort:"+(toplam/snf.size()));//**** ORTALAMAYI BU KISIMDAN DA HESAPLATABİLİRİZ
    }



}
