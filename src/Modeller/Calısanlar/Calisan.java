package Modeller.Calısanlar;

import Modeller.Departmanlar.BilisimTeknolojileriDepartmani;
import Modeller.Departmanlar.Departman;
import Modeller.Departmanlar.InsanKaynaklariDepartmani;
import Modeller.Departmanlar.YonetimDepartmani;
import Veritabani.Calisanlar;
import Veritabani.Departmanlar;

import java.util.ArrayList;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";
    private int ID;
     private static int sayacId = 1;


    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        this.ID=sayacId++;
        Calisanlar.addCalisan(this);

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getSayacId() {
        return sayacId;
    }

    public static void setSayacId(int sayacId) {
        Calisan.sayacId = sayacId;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    //KULLANICININ DEPARTMAN KODUNA GÖRE GEREKLİ DEPARTMAN SET EDİLMELİDİR.
    //DEPARTMAN LİSTESİNİN İÇİNDE KODLAR VAR,VERİTABANI.DEPARTMANLAR.DEPARTMANLİST,BUNLARI DÖNGÜYE TUT

    public void setDepartman(String departman) {
        for (int i = 0; i < Departmanlar.getDepartmanList().size(); i++) {
            if (departman.toUpperCase().equals("IKD")) {
                this.Departman = (InsanKaynaklariDepartmani) this.Departman;
            } else if (departman.toUpperCase().equals("YD")) {
                this.Departman = (YonetimDepartmani) this.Departman;

            } else if (departman.toUpperCase().equals("BTD")) {
                this.Departman = (BilisimTeknolojileriDepartmani) this.Departman;

            }
        }

    }

    private void setCalisanId() {// ÇALIŞAN ID Sİ KENDİNE ÖZEL OLMALI
        calisanId = getIsimKodu();
    }

    private String getIsimKodu() {// İSMİ PARÇALAYAN ID NİN SONUNA EKLEYEN METOD STRİNG METODLAR
//        char char1=adSoyad.charAt(0);
//        int bosluk1=adSoyad.indexOf(" ");
//       char char2=adSoyad.charAt(bosluk1+1);
//        int bosluk2=adSoyad.lastIndexOf(" ");
//       char char3=adSoyad.charAt(bosluk2+1);
//        System.out.println("Başharfler = " + char1+""+char2+""+char3+"");
//        if(!(adSoyad.indexOf(" ")==adSoyad.lastIndexOf(" "))){

        String a= adSoyad.replaceAll("\\B\\S", "");
      System.out.println(a.toUpperCase().replace(" ", ""));
      this.isimKodu = this.Departman.getDepartmanKodu() + (getSayacId()) + a;
       return this.isimKodu;

    }




    public String getCalisanId() { // ÇALIŞANIN ID SİNİ ALMAK İÇİN BASİT GETTER METHOD
        return this.calisanId;
    }


    public Departman getDepartman() { //ÇALIŞANIN DEPARTMANINI ALMAK İÇİN BASİT GETTER METHOD

        return this.Departman;
    }

    public String getDepartmanAdi() {

        if (this.Departman.getDepartmanKodu().equals("YD")) {
            return "Yonetim Departmani";
        } else if (this.Departman.getDepartmanKodu().equals("BTD")) {
            return "Bilisim Teknolojileri Departmani";
        } else
            return "Insan Kaynaklari Departmani";
        /*
                İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.
         */

    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {

        ArrayList<Calisan> calisanlist = Calisanlar.getCalisanList();
        for (int i = 0; i < calisanlist.size(); i++) {
            if (calisanlist.get(i).getCalisanId().equals(calisanId)) {
                calisanlist.get(i).maas += (calisanlist.get(i).maas * calisanlist.get(i).Departman.getZamOrani()) / 100;

            }
/*

            İpucu: Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha
            olabilirdi.

         */


        }
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "calisanId='" + calisanId + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", maas=" + maas +
                ", Departman=" + Departman +
                ", isimKodu='" + isimKodu + '\'' +
                '}';
    }
}


















                                                  // return Calisan.this.maas// çalışan ıd si kullanılarak zam yap






