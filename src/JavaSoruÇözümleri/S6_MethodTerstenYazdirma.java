package JavaSoruÇözümleri;

import Gun25._04_Soru.Ogrenci;

import java.util.Arrays;
import java.util.Scanner;

public class S6_MethodTerstenYazdirma {
    public static void main(String[] args) {


        // Girilen bir diziyi tersten yazdıran bir metod yazınız.


        int[] dizi = {13, 15, 14, 16, 16};
        String []arr={"m","a","l","e","s"};

        terstenYaz(dizi);
        reverseArr(arr);




    }
    public static void terstenYaz(int[]dizi){
        for (int i = dizi.length-1; i >= 0; i--){
            System.out.println(dizi[i]);

        }

    }public static void reverseArr(String []arr)
    {
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);

        }
    }
}



























