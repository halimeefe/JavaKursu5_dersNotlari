package Gun21;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {
    public static void main(String[] args) {


        //dizi,array: booyut sayısı belli, sonradan değiştirilmez
        int[] dizi = new int[5];// Aray 5 elemanlı boyutu sonradan değiştirilemiyor

        // boyutu dinamik olsun,eleman ekledikçe uzasın,sildikçe kısalsın
        //Arraylist: boyutunu başta bile vermene  gerek yok,boyutu başlangıçta 0
        // eleman ekledikçe artar,sildikçe kısalır.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler:" + isimler);

        isimler.add("Ahmet");//UZUNLUK 1    //****add ile diziye eleman ekliyoruz
        isimler.add("Metin");//UZUNLUK 2
        isimler.add("Hacer");// UZUNLUK 3
        isimler.add("Aynur");//UZUNLUK 4


        System.out.println("isimler:" + isimler);
        System.out.println("isimler:" + isimler.size());// Array listlerde lenght alamıyoruz size ile uzunluğunu yani kaç eleman olduğunu öğreniyoruz

        isimler.add(1,"Muhammed");//verilen ındex e ekliyor, diğerleri 1 sağa kayıyor sona doğru//***  1 numaralı indexe yeni elemanı ekledi
        System.out.println("isimler:" + isimler);

        isimler.set(1, "Zafer");// verilen ındex teki elemanı değiştirir //**1.elemanı zaferle değiştirir
        System.out.println("isimler:" + isimler);

        boolean varMi = isimler.contains("Metin");// varmi// FALSE YADA TRUE SONUCU VERİR
        System.out.println("isimler:" + varMi);

        isimler.remove(1);// rakam verildiğinde index kabul ediyor ona göre siliyor // 1. İNDEXTEKİ ELEMANI SİLİYOR
        System.out.println("isimler:"+isimler);

        isimler.remove("Ahmet");
        System.out.println("Ahmet silindi:"+isimler);// STRİNG OLARAK AHMETİ SİLDİK

        int indexOfAynur = isimler.indexOf("Aynur");  // AYNURUN İNDEX NUMARASINI VERİR
        System.out.println("isimler:"+indexOfAynur);

        String ilkEleman = isimler.get(0);//verilen indexteki değeri verir Ahmet// GET İLE İNDEXTE BULUNAN DEĞERİ ÇAĞIRIRIZ
        System.out.println("isimler:"+ilkEleman);

     // TOARRAY: ARRAY LİSTİ ARRAYE ÇEVİRMEK İÇİN KULLANIRIZ**********************************************

       isimler.clear();//herşeyi temizliyor
        isimler.removeAll(isimler);//hepsini siler


    }
}
