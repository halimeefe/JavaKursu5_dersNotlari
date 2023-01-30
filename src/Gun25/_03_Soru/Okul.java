package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {


        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();// HEPSİNİ ARRAYLİSTE ATTIK

        for (int i = 0; i < 3; i++) {   //FOR DÖNGÜSÜ

            Ogrenci ogr = new Ogrenci();
            System.out.print("öğrenci adı:");
            ogr.adi = okuStr.nextLine();
            System.out.print("öğrenci soyadı:");
            ogr.soyAdi = okuStr.nextLine();
            System.out.print("öğrenci sınıfı:");
            ogr.sinifi = okuInt.nextInt();
            System.out.print("öğrencinin adresi:");
            ogr.adres = okuStr.nextLine();

            snf.add(ogr);
        }
        for (Ogrenci ogr:snf)  // FOREACH
        {
            System.out.println("oğr adı:"+ogr.adi);
            System.out.println("ogr soyadı:"+ogr.soyAdi);
            System.out.println("ogr sınıfı:"+ogr.sinifi);
            System.out.println("ogr adres:"+ogr.adres);

        }
    }

}

