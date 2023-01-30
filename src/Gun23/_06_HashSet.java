package Gun23;

import Gun25._04_Soru.Ogrenci;

import java.util.HashSet;
import java.util.NavigableSet;

public class _06_HashSet {
    public static void main(String[] args) {
        HashSet<Integer>setA=new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer>setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA:"+setA);
        System.out.println("setb:"+setB);

        //BİRLEŞTİRME
        HashSet<Integer>birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);
        System.out.println("birleşik hsli:"+birlesikHali);// aynı elemanları yeni diziye almaz

        // FARKINI ALMA

        HashSet<Integer>farki=new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB);  //**REMOVE ALL DEMEK B NİN ELEMANLARINI ANIN İÇİNDEN SİL DEMEK***
        System.out.println("farkı:"+farki);// A DAN B NİN ELEMANLARINI ÇIKARIR

        //ORTAK ELEMANLAR***KESİŞİM**//
        HashSet<Integer>ortakElamanlar=new HashSet<>();
        ortakElamanlar.addAll(setA);
        ortakElamanlar.retainAll(setB);//**********************RETAİNALL****İKİ DİZİDEKİ ORTAK ELEMANLARI VERİR*****
        System.out.println("ortak elemanlar:"+ortakElamanlar);





    }
}
