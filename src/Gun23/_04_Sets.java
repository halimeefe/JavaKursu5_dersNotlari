package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {

        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(4);

        System.out.println("hs:"+hs.size());//eleman sayısı nı verir:6//******SİZE******* ELEMAN SAYISINI VERİR****

        hs.remove(5);//elemanın kendi değerini siliyor.//********************REMOVE*******5 İ  SİLER***
        System.out.println("remove:"+hs);

        if (hs.contains(7))// 7 varmı demek//*******************************CONTAİNS*****ARANAN ELEMAN VAR MI********
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear();// hepsini siler//**************************************CLEAR************HEPSİNİ SİLER***********
        System.out.println("hs:"+hs);

        //int[]
        // İNDEX VAR: DİZİ[İ]
        //FORİ >SIRA GARANTİ ÇÜNKÜ İNDEXE GÖRE GİDİYOR
        //FOREACH >SIRA GARANTİ DEĞİL

        //ARRAYLİST>
        //İNDEX VAR:(GET(İ))
        //FORİ>SIRA GARANTİ ,ÇÜNKÜ İNDEXE GÖRE GİDİYOR
        //FOREACH > SIRA GARANTİ DEĞİL

        //SETLERDE
        //İNDEX YK
        //FORİ YOK
        //FOREACH > SIRA GARANTİ DEĞİL
        // GARANTİ İSTİYORSAN ITERATOR YÖNTEMİ









    }
}
