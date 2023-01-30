package Gun35._03_Polymorphısan;

public class OkulMain {
    public static void main(String[] args) {


        Ogrenci ogr=new Ogrenci("İSMET","TEMUR","ÖĞRENCİ","5A");
        Calisan cl=new Calisan("ALİ","VELİ","DANIŞMA","İ.K");

      Kisi.kimlikYaz(ogr);
      Kisi.kimlikYaz(cl);
    }

}
