package Gun30._01_StaticVariables.Ornek_1;

public class Okul {
    public static void main(String[] args) {


      //  //   Ogrenci ogr1=new Ogrenci("iSMET" ,"TEMUR","YILDIRIM İLKOKULU");
       // Ogrenci ogr2 = new Ogrenci("BEYZA", "YILMAZ", "YILDIRIM İLKOKULU");
       // Ogrenci ogr3 = new Ogrenci("ALİ", "KARA", "YILDIRIM İLKOKULU");
        //
        //
       // Ogrenci ogr499 = new Ogrenci("AYŞE", "GENÇ", "YILDIRIM İLKOKULU");
       // Ogrenci ogr500 = new Ogrenci("iSMET", "BAYRAK", "YILDIRIM İLKOKULU");

        //OKUL ADI HERKESTE AİT , HERKESE AİT OLANLAR CLASA AİT OLUYOR
        //BU YÜZDEN OKUL ADININ BAŞINA STATİC YAZIYORUZ

        Ogrenci ogr1=new Ogrenci("İSMET","TEMUR");
        System.out.println("ogr1:"+ogr1);// STATİC DEĞİŞKENLER BİR TANEDİR ,EN SON ATANANI KABUL EDER

        Ogrenci.okulAd="Atatürk Ilkokulu";// YILDIRIM İLKOOKULUNU SİLDİK VE ATATÜRL İLKOKULU YAPTIK
        System.out.println("ogr1 tekrar:"+ogr1);  // statik lerde son girilen değer kabul edilir******

        //AYNI VERİNİN ÇOK KEZ GİRİŞİ ENGELLENDİ
        //AYNI VERİNİN HAFIZADA NESNE SAYISI KADAR TEKRARALANMASI ENGELLENDİ
        // STATİC DEĞERLER AYNI METOD GİBİ SINIFA AİTTİR

        Ogrenci ogr2=new Ogrenci("ALİ","YILDIRIM");
        System.out.println("ogr2="+ogr2);











    }
}
