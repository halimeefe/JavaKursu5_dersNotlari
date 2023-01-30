package Gun23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class _03_Sets {
    public static void main(String[] args) {

        //*****HASHSETLERDE İNDEX KAVRAMI YOK ÇÜNKÜ SIRALARI HER ZAMAN DEĞİŞEBİLİYOR*********//

        HashSet<String>renkler=new HashSet<>();
        renkler.add("red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("red");
        renkler.add("RED");// Büyük ve Küçük harfli aynı kelime olmasına rağmen , ayrı eleman sayar

        //ekrana yazdırma
        System.out.println("renkler:"+renkler);// hashset rastgele sıralar,her zaman elemanların yerini değiştirir

        //ekrana tek tek nasıl yazdırırım
        for (String eleman:renkler) {
            System.out.println("eleman:"+eleman);// foreach te sıra garanti değil ama alt alta sıraya koyar

        }
        //foreach le ilgili örnek
        int []dizi={34,5,6,7,8,89,899,77};//***FOREACHİ HER YERDE KULLANABİLİRİZ***SIRA GARANTİ DEĞİL****
        for(int sayi :dizi)
        {
        System.out.println("sayı:"+sayi);

        }
        //SET İN KENDİ SIRASI NASILSA ONUN AYNISINI VERİR ORJİNAL SIRAYI VERİR ITERATÖR

        //TREESETLE SIRAYA KOYARSAK SONRADA ITERATOR İLE INDEXİNİ ALABİLİRİZ

        Iterator gosterge=renkler.iterator();// iteratör itelemek gibi eğer varsa sonraki elemanı verir
        while (gosterge.hasNext())// INDEXTE ITERATÖR DEN FAYDALANCAZ ,LİNKED YADA TREE SET LE SIRALAYIP BU
                                  //ŞEKİLDE ITERATÖR İLE SIRALAYAIP İNDEXİ ALABİLİRİZ
        {
            System.out.println("gösterdiği eleman:"+gosterge.next());
            //Next göstergenin gösterdiği elemanı temsil ediyor
            // kaç eleman verceğini bilmediğimiz için while kullandık
            // HASNEXT BU ELEMAN VARSA DEMEK TİR
        }



    }
}
