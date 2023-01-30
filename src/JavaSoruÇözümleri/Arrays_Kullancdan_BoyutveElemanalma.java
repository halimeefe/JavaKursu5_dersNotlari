package JavaSoruÇözümleri;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Kullancdan_BoyutveElemanalma {
    public static void main(String[] args) {


        // kullanıcıdan Arrayın boyutunu ve
        //elementlerini alıp arrayi oluşturan
        //ve bize döndüren bir method oluşturun

        int[] kullaniciArrayi = arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));

    }
    public static int[] arrayOlustur() {

        Scanner oku = new Scanner(System.in);
        System.out.print("arrayin boyutunu giriniz:");
        int length = oku.nextInt();
        int[] kullaniciArrayi = new int[length];

        for (int i = 0; i < length; i++) {

            System.out.print("array e eklenecek bir sayı giriniz:");
            kullaniciArrayi[i] = oku.nextInt();
        }
        return kullaniciArrayi;


    }
}
