package JavaSoruÇözümleri;

import java.util.Arrays;

public class ArrayUretMethodu {
    public static void main(String[] args) {


        // soru: Verilen değer uzunluğunda ARRAY üreten bir method yazınız


        int []x=arrayUret(5);
        System.out.println(Arrays.toString(x));


    }public static int[] arrayUret(int lenght)
    {


        int[]sonuc=new int[lenght];
        return sonuc;
    }
}
