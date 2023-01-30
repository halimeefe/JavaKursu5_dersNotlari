package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafızada 1 sayı saklıyor
        int[] dizi=new int[6]; // hafızada 6 sayı saklar : sabit boyutlu
        int[][] tablo=new int[3][20]; //hafızada 60 sayı saklıyor, 3x20 şeklinde : sabit boyutlu

        // dizi lazım, ama boyutu ekledikçe artsın, sildikçe azalsın
       // ArrayList<Integer> liste=new ArrayList<>(); // boyu değişken
       // ArrayList< ArrayList<Integer> > listelerinListesi = new ArrayList<>(); // 2 boyutlu, 2 boyutu da değişken

      // Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle set ver bana, yani dizi tip ver bana.
        // Java mektubumuza cevap verdi :
        // Sevgili Muhammed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
        // dizilerimiz var dedi.
        // **HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
        // ***LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // ***TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.

        //**************************************************************//
        // **** Hashseti tc lerde ıde numaralarında ,telefon numaralarında,tek seferlik kullanılması gereken yerlerde kullanırız***
        ArrayList<ArrayList<Integer>>listelerinListesi=new ArrayList<>();//2 BOYUTLU ARRRAYLİST


        HashSet<Integer>hs1=new HashSet<>();// ARRAYLİST GİBİ AMA TEKRAR DEĞERLERİ ALMAZ HASHSET
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi= hs1.add(5);//true
        boolean tekrarEklendiMi=hs1.add(5);//false// 5 i tekrar eklemez
        hs1.add(2);
        System.out.println("eklendi mi:"+eklendiMi);
        System.out.println("tekrar eklendi mi:"+tekrarEklendiMi);
        System.out.println("hs1:"+hs1);

//         Add(Parametre): ParametAre olarak girilen veri tipine ait öğeleri ekler. Fakat, parametre olarak girilen değer daha önce “HashSet” yapısında bulunuyorsa, o değeri tekrar eklemez.
//                Remove(Parametre): HashSet içerisinde parametre olarak aldığı veri bulunuyorsa o veriyi siler.
//        Clear(): Tanımlamış olduğumuz HashSet yapısı içerisinde bulunan bütün değerleri siler.
//                Clone(): HashSet yapımızın içerdiği değerlerle birlikte bir kopyasını oluşturur.
//        Size(): HashSet içerisinde bulunan öğe sayısını belirtir.
//        Contains(Parametre): Parametre olarak aldığı değeri küme içerisinde bulunuyorsa true, bulunmuyorsa false değerlerini döndürür.
//        IsEmpty(): HashSet içerisinde eleman içermediğini kontrol etmek için kullanılır. Eğer, küme yapımız boş ise true değerini döndürür.
//        Iterator(): Girmiş olduğumuz verilerin üzerinde bir tekrarlayıcı döndürmek için kullanılır.
//









    }
}
