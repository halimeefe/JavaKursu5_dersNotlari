package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {


        // Sets
        //Hashset: Hızlı ,bunun için kendine göre algoritmik sırada tutar
        //LinkedHashset: EKLEME SIRASINA GÖRE SIRALI TUTAR
        // TreeSet: HER ZAMAN İÇİNDE SIRALI ŞEKİLDE TUTAR,KENDİNDEN SORTLU

        //HIZLI,BUNUN İÇİN KENDİNE GÖRE ALGORİTMİK SIRADA TUTAR
        HashSet<String>hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs:"+hs);// Hashsete güven olmaz kendine göre sıralar

        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs:"+lhs);// LinkedHashSet yazıldığı sıraya göre sıralar

        TreeSet<String>ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts:"+ts);//TreeSet küçükten büyüğe yada alfabetik sıraya göre sıralar





    }
}
