package Gun07;

import java.util.Scanner;

public class _07_OzelSoru {
    public static void main(String[] args) {


        // Girilen bir cümlede kaç kelime olduğunu bulunuz.

Scanner oku=new Scanner(System.in);
        System.out.print("cumle  giriniz:");
        String cumle=oku.nextLine();
        cumle =cumle.trim().toLowerCase().replaceAll("[0-9]"," ").replaceAll(" ","1").replaceAll("[^0-9]","");
        int bosluk=cumle.length()+1;
        System.out.println("kelime sayısı:"+bosluk);

    // TRİM BAŞTAKİ VE SONDAKİ BOŞLUKLARI SİLER

        Scanner input = new Scanner(System.in);
        System.out.print("lutfen bir cumle yaziniz : ");
        String girilenCumle = input.nextLine();
        int ilkUzunluk = girilenCumle.length();
        System.out.println("ilk uzunluk : " + ilkUzunluk);
        String boslukSil = girilenCumle.replace(" ","");
        int ikinciUzunluk = boslukSil.length();
        System.out.println("son uzunluk : " + ikinciUzunluk);
        int kelimeSayisi = (ilkUzunluk - ikinciUzunluk) + 1;
        System.out.println("cumledeki kelime sayisi = " + kelimeSayisi);

















    }
}
