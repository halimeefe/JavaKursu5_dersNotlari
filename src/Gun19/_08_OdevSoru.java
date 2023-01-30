package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _08_OdevSoru {
    public static void main(String[] args) {

        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i + ".sayı");
            dizi[i] = oku.nextInt();
            int topl = 0;
        }
        System.out.println(Arrays.toString(dizi));

        enKucukYaz(dizi);
        enBuyukYaz(dizi);

    }

    public static void enKucukYaz(int[] sayilar) {
        Arrays.sort(sayilar);
        System.out.println("en küçük=" + sayilar[0]);

    }

    public static void enBuyukYaz(int[] sayilar) {
        Arrays.sort(sayilar);
        System.out.println("enbüyük = " + sayilar[sayilar.length - 1]);
    }






    }














