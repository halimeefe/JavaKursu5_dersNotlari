package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {

        // BİR KARTVİZİT UYGULAMASINI 2 KİŞİ İÇİN YAPINIZ

        HashMap<String,String>uKartVizit=new HashMap<>();
        uKartVizit.put("isim","Uğur Yılmaz");
        uKartVizit.put("email","ugur@gmail.com");
        uKartVizit.put("adres","Çekmeköy/İstanbul");
        uKartVizit.put("telefon"," 05056667778");

        System.out.println("uKartVizit.get(isim):"+uKartVizit.get("isim"));//GET.İSİM YAZINCA İSMİNİ VERİR

        System.out.println("uKartVizit.get(tel):"+uKartVizit.get("telefon"));// GET.TELEFON YAZINCA TELEFON NOYU VERİR

        HashMap<String,String>aKartvizit=new HashMap<>();
        aKartvizit.put("isim","Ayşe Bayrak");
        aKartvizit.put("email","ayse@gmail.com");
        aKartvizit.put("adres","Şişli/ İstanbul");
        aKartvizit.put("telefon","053244455667");



         //**************YUKARDAKİ İKİ KARTVİZİTİ TEK BİR DEĞİŞKEN İÇİNDE TANIMLADIK*****************//

        HashMap< String,HashMap< String,String > >kartvizitler=new HashMap<>();// BU İKİ KARTVİZİTİ 2 BOYUTLU MAPİN İÇİNE ATARIZ
        //ADINA KARTVİZİTLER DERİZ


        kartvizitler.put("uğur",uKartVizit); //ARRAY LİSTİN MANTIĞI GİBİ BURADA HERŞEYİ EKLEYEBİLİRİZ //***BURADA UĞURU KEY YAPTIK
        kartvizitler.put("ayşe",aKartvizit); // AYŞE NİN BÜTÜN BİLGİLERİNİ KARTVİZİTLER.PUT OLARAK TOPLADIK //** BURADA DA AYŞE Yİ KEY OLARAK SEÇTİK

        System.out.println("karvizitler.get(uğur):"+kartvizitler.get("uğur")); // UĞURUN BÜTÜN BİLGİLERİNİ TOPLU OLARAK KATVİZİTLER.GET İLE ÇAĞIRDIK

        System.out.println("kartvizitler.get(ayşe):"+kartvizitler.get("ayşe"));// AYŞENİN BÜTÜN BİLGİLERİNİ  KARTVİZİTLER.GET BU ŞEKİLDE 2 BOYUTLU MAP İLE ALIRIZ

        System.out.println("Ayşe nin adresi:"+kartvizitler.get("ayşe").get("adres"));// BURADA 2 GET İLE AYŞE NİN ADRESİNİ ALDIK


        for(Map.Entry<String,  HashMap<String,String>>    kv:kartvizitler.entrySet())  // sadece emailleri kartvizitlerden FOREACH İLE ALDIK
        {
            System.out.println("emailler : "+kv.getValue().get("email"));// kartvizitlerde kayıtlı olan sadece e mailleri yazdırdık


        }

        }

}

