package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // Baklava dilimi-> if
        // girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız.
        //Alghoritma
        //1-Başla  {
        //2-sayi oku sayi oku=nextInt()
        //3- sayi> 10 ise " 10 dan büyük "yaz -> if (sayi>10)sout...
        //4- Dur

        Scanner oku =new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi = oku.nextInt();

        if(sayi>10) // normal parantezler şart
        { //if şartı sağlandığında yapılacakların parantezi

            System.out.println("10 dan büyük");
            System.out.println("if in içinde birden fazla komut var ise if parantezleri şattır");
        }




    }
}
