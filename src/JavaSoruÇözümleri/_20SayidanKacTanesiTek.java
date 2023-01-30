package JavaSoruÇözümleri;

import java.util.Scanner;

public class _20SayidanKacTanesiTek {
    public static void main(String[] args) {


        // Kullanıcının gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int adet=0;


        while (sayac<=20){
            System.out.print(sayac+".SAYI GİRİNİZ:");
            int sayi= oku.nextInt();
            if (sayi%2!=0){
                adet++;
            }
            sayac++;
        }System.out.println("tek sayı adeti:"+adet);


        }



    }

