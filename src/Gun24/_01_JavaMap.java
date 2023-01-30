package Gun24;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //SET-> HASHSET, LİNKEDhASHSET,TREESET
        //MAP->HASHMAP,LİNKEDHASHMAP,TREEMAP
        //MAP=ANAHTAR +SET ->ANAHTARLI SET
        //*****HASHMAP TE İNDEXİ BİZ VERİYORUZ KEY OLARAK*****//

        //ANAHTARIN TİPİ İNTEGER,DEĞERİNİN TİPİ STRİNG OLSUN*****//****DEĞERLERİN YERİ DEĞİŞEBİLİR
        HashMap <Integer, String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");//ODA NUMARASINI KENDİM SEÇİYORUM 1001 E İSMET TEMUR VERDİM**VALUE ISMET DEMİR ,**KEY İSE 1001 DİR
        hm.put(1002,"Cihat Yılmaz");//INTEGER KEY VE STRİNG VALUE OLUYOR
        hm.put(2001,"Talip Yıldız");
        hm.put(5001,"Eyüpcan Bilgin");
        hm.put(1002,"Hatice Bayrak");// 1002 KEY DEN 2 TANE YAZDIĞIMIZ İÇİN SON YAZDIĞIMIZI KABUL ETTİ


        //**PUT İLE ELAMAN ATIYORUZ

        System.out.println("hm:"+hm);
        System.out.println("hm.get 2001 "+hm.get(1002));  //***GET İLE KEYİ YAZIP ELEMANI ÇAĞIRIRIZ
        System.out.println("hm.get 5001 "+hm.get(5001));  //***GET İLE KEY NOYU YAZIP STRİNGİ ALIRIZ

        System.out.println("hm.containsKey 2001:"+hm.containsKey(2001));//*** VARMI YOKMU YU CONTAİNS KEY İLE YAPARIZ//**TRUE**FALSE
        System.out.println("hm.containsKey 12:"+hm.containsKey(12));

        System.out.println("hm.keyset:"+hm.keySet());// ***KEY NUMARASINI  YAZDIRIR ***INTEGER
        System.out.println("hm.values:"+hm.values());//*** VALUES LARI YAZDIRIR********STRİNG**KEYLERE ATANAN DEĞERLERİ ALIYORUZ

        hm.remove(5001);// 5001 deki elemanı siler//  *** REMOVE  ELEMANI SİLER
        System.out.println("hm:"+hm);

        System.out.println("hm.size:"+hm.size());// ***ELEMAN SAYISINI SİZE İLE VERİR
        hm.clear();
        System.out.println("hm sil:"+hm);// ****TAMAMINI SİLER






    }
}
