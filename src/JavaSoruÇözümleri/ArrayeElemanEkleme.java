package JavaSoruÇözümleri;

import java.util.Arrays;

public class ArrayeElemanEkleme {
    public static void main(String[] args) {


        //verilen bir int arraye  istenen bir elementi ekleyip
        //yeni halini bize döndüren bir method oluşturun

        int[] dizi = {3, 5, 8, 9};
        int eklenecekSayi = 1;
        dizi = arrayeElemanEkle(dizi, eklenecekSayi);
        System.out.println(Arrays.toString(dizi));

    }

    public static int[] arrayeElemanEkle(int[] eklenecekArray, int eklenecekSayi) {
        int[] yeniArray = new int[eklenecekArray.length + 1];
        for (int i = 0; i < eklenecekArray.length; i++) {
            yeniArray[i] = eklenecekArray[i];

        }
        yeniArray[yeniArray.length - 1] = eklenecekSayi;
    return yeniArray;
    }







    }

