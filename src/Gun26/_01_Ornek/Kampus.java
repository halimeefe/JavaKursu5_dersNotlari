package Gun26._01_Ornek;

import Gun25._04_Soru.Ogrenci;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="İsmet Temur";


        //1. yöntem
        ogr.okulu=new Okul();//  yeni bitr okul oluşturuyoruz
        ogr.okulu.adi="mehmet akif ersoy okulu";
        ogr.okulu.mudurAdi="Merve ASLAN";
        ogr.okulu.ucreti=50000;

        //2.yöntem
        Okul ok=new Okul();  // yeni bir okul oluşturuyoruz
        ok.adi="Mehmet akif ersoy okulu";
        ok.mudurAdi="Merve Aslan";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("okul mo:"+ogr.okulNo);// bunların yerine daha kısa şekilde metod yzabiliriz
        System.out.println("tam ad:"+ogr.tamAd);
        System.out.println("okul ad:"+ogr.okulu.adi);
        System.out.println("mudur adi:"+ogr.okulu.mudurAdi);
        System.out.println("ucreti:"+ogr.okulu.ucreti);
















    }
}
