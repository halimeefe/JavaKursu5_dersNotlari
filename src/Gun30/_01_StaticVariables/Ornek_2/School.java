package Gun30._01_StaticVariables.Ornek_2;

import java.util.Map;

public class School {
    public static void main(String[] args) {


        Student ogr1=new Student(1,"İsmet temur");
        Student ogr2=new Student(2,"MEHMET YILMAZ");
        Student ogr3=new Student(3,"beyza demir");

        //NUMARAYI KENDİM VERİNCE HEM ID Yİ TAKİP ETMEK
        //ZORUNDAYIM HEMDE HATA VERME İHTİMALİ ÇOK YÜKSEK
        //BU YÜZDEN BİR TANE SAYAC OLmaLI VE HEPSİNE
        //ID ATAMALI SIRAYLA
        //BİR TANE OLAN NESNELERE BİZ STATİC EKLİYORUZ



        Student ogr10=new Student("İSMET TEMUR");
        Student ogr11=new Student("MEHMET YILMAZ");
        Student ogr12=new Student("BEYZA DEMİR");
        System.out.println("ogr10="+ogr10);
        System.out.println("ogr11:"+ogr11);
        System.out.println("ogr12:"+ogr12);


    }



}
