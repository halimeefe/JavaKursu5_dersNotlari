package Gun17;

import java.util.Scanner;

public class  _01_JavaArray {
    public static void main(String[] args) {

        // 50 ELEMANLI BİR DİZİ TANIMLAYINIZ.10 A KADRA OLAN SAYILARDAN RANDOM ATAYARAK
        // DOLDURUNUZ.sONRASINDA AYRI BİR DÖNGÜ İLE TEK OLANLAR1 1 e,
        //ÇİFT OLANLARI 0 A ATAYINIZ.

        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*10);
        }

        //dizi önce
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi önce= " + dizi[i]);
        }

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] %2==0) // çiftse
                dizi[i]=0;
            else // tekse
                dizi[i]=1;
        }

        //dizi sonra
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi sonra = " + dizi[i]);
        }


    }
    }

