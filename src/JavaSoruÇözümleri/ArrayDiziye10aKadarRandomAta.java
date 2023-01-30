package JavaSoruÇözümleri;

import sun.text.resources.cldr.ia.FormatData_ia;

public class ArrayDiziye10aKadarRandomAta {
    public static void main(String[] args) {

        // 50 ELEMANLI BİR DİZİ TANIMLAYINIZ.10 A KADRA OLAN SAYILARDAN RANDOM ATAYARAK
        // DOLDURUNUZ.sONRASINDA AYRI BİR DÖNGÜ İLE TEK OLANLAR1 1 e,
        //ÇİFT OLANLARI 0 A ATAYINIZ.

        // NOT: ÖNCE  DİZİYİ  10 ELEMANLI İNT YENİ DİZİ YAZIP VE FOR LOOPLA OLUŞTURUP İÇİNE RANDOM 10 ELEMAN ATIYALIM
        // SONRA YİNE FOR LOOPLA ELEMANLARI  SOUT İLE OKUTALIM
        // SONRA YİNE FOR LOOPLA DİZİP ÇİFTSE 0 A TEKSE 1 E ATAYALIM
        // EN SON Kİ HALİNİ YİNE FOR LOOPLA OLUŞTURUP SOUT İLE EN SON HALİNİ SIRALAYALIM

        int[]dizi=new int[10];  // DİZİYİ TANIMLADIK

        for (int i = 0; i < dizi.length; i++) {  // DOLDURACAĞIMIZ DİZİNİN DÖNGÜSÜ
            dizi[i]=(int)(Math.random()*10);  // 10 A KADAR SAYILARLA DİZİYİ RANDOM OLARAK  DOLDURDUK

        }
        for (int i = 0; i < dizi.length; i++) {  // FOR DÖNGÜSÜ İLE YİNE  YENİ OLUŞAN RANDOMLI HALİNİ BU FORLA YAZDIRIRIZ
            System.out.println("dizi önce:"+dizi[i]);// RANDOM SEÇİLEN RAKAMLARI YAZDIRIRIZ
        }
        for (int i = 0; i < dizi.length; i++) {  // YİNE DİZİ NİN RANDOM ATANAN SAYILARINI TEK VE ÇİFT AYIRACAK DÖNGÜ
            if (dizi[i]%2==0)  // EĞER ÇİFTSE 0 A
                dizi[i]=0;
            else
                dizi[i]=1;     // EĞER TEKSE 1 E
        }
        for (int i = 0; i < dizi.length; i++) { // DİZİ NİN OLUŞAN SON HALİ TEK VE ÇİFT OLARAK
            System.out.println("dizi sonra:"+dizi[i]);// BURADADA YAZDIRIRIZ
        }
        }





    }

