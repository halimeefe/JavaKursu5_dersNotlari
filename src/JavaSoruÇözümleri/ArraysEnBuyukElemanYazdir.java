package JavaSoruÇözümleri;

import java.util.Arrays;

public class ArraysEnBuyukElemanYazdir {
    public static void main(String[] args) {



        //int Array oluşturun ve elemanları : 12,2,5,15,8

        // En büyük değeri yazdırınız.

        int[]dizi={12,2,5,15,8};
        Arrays.sort(dizi);

        int max=dizi[0];
        for (int i=0;i<dizi.length;i++){
            if (dizi[i] >max){
                max=dizi[i];

            }
        }
        System.out.println("en büyük:"+max);
        //*********************************************************//

        Arrays.sort(dizi);
        System.out.println("max:"+dizi[dizi.length-1]);














    }


}
