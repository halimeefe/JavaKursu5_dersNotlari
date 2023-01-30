package JavaSoruÇözümleri;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanToplam {
    public static void main(String[] args) {



        // girilen sayıya kadar olan toplamı yazdırınız

        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int sayi=0;
        int toplam=0;

        System.out.print("sayi giriniz:");
        sayi=oku.nextInt();


         while (sayac<=sayi){

             toplam=toplam+sayac;
             sayac++;

             System.out.println(toplam);

         }
         //FOR İLE//
        //for(i=0;i<=sayi;i++)
        //toplam+=i;
        //system.out.println("toplam)


    }

    }
