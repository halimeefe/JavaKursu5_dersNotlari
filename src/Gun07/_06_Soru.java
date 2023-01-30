package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // tek seferde girilen bir ad soyadın (tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız.(sadece ad ve soyad)


        Scanner oku= new Scanner(System.in);   // AD: 0,BOŞLUĞUN İNDEXİNE KADAR
        System.out.print(" adınız ve soyadınız:");//SOYAD: BOŞLUK +1 DEN SONUNA KADAR
        String tamAd=oku.nextLine();

        int boslukIndex = tamAd.indexOf(" ");
        String ad= tamAd.substring(0,boslukIndex);
        String soyad= tamAd.substring(boslukIndex+1);// 2.İNDEXİ VERMEZSEN SONUNA KADAR ALIR

        System.out.println("ad="+ ad);
        System.out.println("soyad="+ soyad);



    }

}
