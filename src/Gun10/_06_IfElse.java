package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {


        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        //kurallar:
        //1) en az 8 karakter olmalı
        //2)içinde pass kelimesi olmamamlı
        //3) en fazla 12 karakter olmalı




        Scanner oku=new Scanner(System.in);
        System.out.print("SİFRE GİRİNİZ:");
        String sifre= oku.nextLine();

        if (sifre.length() >=8 && sifre.length() <=12 && sifre.toLowerCase().contains("pass")==false)
            System.out.println("UYGUN");
        else
            System.out.println("UYGUN DEĞİL");


        //2.YÖNTEM
        if (sifre.length() >=8 && sifre.length()<=12 && !sifre.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println("uygun değil");

        //3.yöntem

        int uzunluk=sifre.length();
        boolean varMi=sifre.toLowerCase().contains("pass");
        if (uzunluk >= 8 && uzunluk <=12 && varMi== false)
            System.out.println(" uygun");
        else
            System.out.println("uygun değil");













    }
}
