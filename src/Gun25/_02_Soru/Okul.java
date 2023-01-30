package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {


        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.

        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();// HEPSİNİ ARRAYLİSTE ATTIK

        for (int i = 0; i < 3; i++) {   //FOR DÖNGÜSÜ

            Ogrenci ogr = new Ogrenci();
            System.out.print("öğrenci adı:");// ÖĞRENCİ BİLGİLERİ ALDIĞIMIZ MODÜL KISMI KULLANICIDAN ALINIR
            ogr.adi = okuStr.nextLine();
            System.out.print("öğrenci soyadı:");
            ogr.soyAdi = okuStr.nextLine();
            System.out.print("öğrenci sınıfı:");
            ogr.sinifi = okuInt.nextInt();
            System.out.print("öğrencinin adresi:");
            ogr.adres = okuStr.nextLine();

            snf.add(ogr);// BİLGİLER ARRAYLİSTTEKİ SINIFA GÖNDERİLİR
        }
        for (Ogrenci ogr:snf)  // FOREACH// FOREACH İLE BİZE BİLGİLER GERİ DÖNDÜRÜLÜR
              {
                  System.out.println("oğr adı:"+ogr.adi);
                  System.out.println("ogr soyadı:"+ogr.soyAdi);
                  System.out.println("ogr sınıfı:"+ogr.sinifi);
                  System.out.println("ogr adres:"+ogr.adres);

              }
    }

}

class Ogrenci{// BU ELEMANLARA PROPERTİS,FİELD YADA ÖZELLİK DİYORUZ// ÖĞRENCİ MODÜLÜ HAZIRLADIK
    String adi;
    String soyAdi;
    int sinifi;
    String adres;



  }



