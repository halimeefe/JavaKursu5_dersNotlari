package JavaSoruÇözümleri;

import java.util.Arrays;

public class ArraysEnBuyukIkinciEleman {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30

        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi = {15, 25, 22, 18, 30};
        int i;

        int enbuyuk = dizi[0];
        int ikinciBuyuk = dizi[0];

        for (i = 1; i < dizi.length; i++) {
            if (dizi[i] > enbuyuk) {
                ikinciBuyuk = enbuyuk;
                enbuyuk = dizi[i];

            } else if (dizi[i] > ikinciBuyuk) {
                ikinciBuyuk = dizi[i];

            }
        }
        System.out.println("en büyük 2.eleman" + ikinciBuyuk);
        //****************************************************************//

        Arrays.sort(dizi);
        System.out.println("2.sonuç:"+dizi[dizi.length-2]);





    }
}
