package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {




        Scanner oku=new Scanner(System.in);
        System.out.print(" SAYILARI BİR BOŞLUK BIRAKARAK GİRİNİZ:");
        String sayilar=oku.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex);
        String srtSayi2=sayilar.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(srtSayi2);

        if (sayi1==sayi2)
            System.out.println("EŞİT");
        else
            System.out.println("DEĞİL");





    }
}
