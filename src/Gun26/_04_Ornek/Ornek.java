package Gun26._04_Ornek;

import Gun25._05_Soru.Calisan;

import java.util.ArrayList;
import java.util.Collections;

public class Ornek {
//   1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
//            2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
//    fatura(double))  class tanımlayınız
//        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
//        4.Adım  :1 tane müşteri oluşturunuz,
//            5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
//    tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
//            6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.
//
//    ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
//    ondan sonra toplam alarak çıkartınız  */

    //1. classta sadece müşteri name ve elektrik hesabı olcak
    //2.class elektrik hesabı adında olcak  :int toplam tüketim,double birim fiyatı,double fatura
    //3.1 tane  new müşteri tanımla
    //4.müşteriye ait her ay kullandığı enerjiyi toplayacak bir metod yazınız,İsmi tüketim ekle olsun,her ay ki faturayı  toplasın,3 fatura
    //5.toplam tüketimi (0.7) ile çarparak hesaplatın her ayki metdda toplanacak rakam yani
    //6. faturayı tplam larak çıkartın


    public static void main(String[] args) {



            Musteri m1=new Musteri();// yeni müşteri oluşturduk
            m1.name="İsmet Temur";

           m1.elektrikHesabi=new ElektrikHesabi();// yeni bir elektrik hesabı oluşturduk

            m1.elektrikHesabi.tuketimEkle(50);
            m1.elektrikHesabi.tuketimEkle(60);
            m1.elektrikHesabi.tuketimEkle(70);

            m1.elektrikHesabi.toplamTuketimYaz();

            m1.elektrikHesabi.faturaYaz(m1.name);


        }




}

