package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {



        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002,"Cihat Yılmaz");
        hm.put(2001,"Talip Yıldız");
        hm.put(5001,"Eyüpcan Bilgin");
        hm.put(1002,"Hatice Bayrak");


        System.out.println("hm.keyset:"+hm.keySet());// dizi şeklinde sdece keyleri yazar
        System.out.println("hm.values:"+hm.values());// dizi şeklinde sadce value ları yazar
                                                     // bunları foreach lede yazdırabiliriz

        for (Integer k: hm.keySet()) // foreach le bu şekilde yazdırılır
            System.out.print(k+"\t");  //İNDEX KAVRAMI OLMADIĞI İÇİN FOREACH KULLANIRIZ FORİ KULLANAMAYIZ
                                       //
        System.out.println();

        for (String v: hm.values())    // VALUES LARI YAN YANA YAZDIRIRIZ
            System.out.print(v+"\t");

        System.out.println();


        for (Map.Entry<Integer,String> kv: hm.entrySet())  // TAMAMINI YAZDIRMAK İÇİN MAP.ENTRY KULLANIRIZ ** KV:KEY VE WORDLERİ ALMAK İÇİN YAZILIR
        {                                                 // key leri ve value ları beraber Map entry ile yazdırırız.
            System.out.println(kv.getKey()+" - "+kv.getValue());// KEYLERİ GETKEY İLE GETVALUE LARI MAPENTRY OLARAK YANYANA YAZDIRABİLİRİZ

        }
    }

}

