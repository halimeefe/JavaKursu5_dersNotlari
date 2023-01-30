package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {

        // SORU:GİRİLEN SAYİ 50 DEN BÜYÜKSE 1 ,DEĞİLSE 0 DEĞERİNİ
        //EKRANA YAZDIRINIZ.
        //TERNARY OPERATÖR İLE YAPINIZ.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi=oku.nextInt();

        System.out.println( (sayi>50) ?  "1" : "0" );//1. yöntem


        //2.yöntem

        int sonuc=(sayi>50)? 1 : 0;
        System.out.println("sonuç:"+sonuc);







    }
}
