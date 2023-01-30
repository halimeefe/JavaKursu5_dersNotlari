package JavaSoruÇözümleri;

import java.util.Arrays;

public class ArraysEnKucukElemanYazdir {
    public static void main(String[] args) {





        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21

        //En küçük (minimum) sayıyı yazdırınız.

        int[]dizi={14,19,5,21};

        Arrays.sort(dizi);
        System.out.println("en küçük sayı :"+dizi[0]);



    }
}
