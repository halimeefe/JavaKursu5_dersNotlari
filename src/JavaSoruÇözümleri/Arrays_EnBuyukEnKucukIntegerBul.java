package JavaSoruÇözümleri;

import java.util.Arrays;

public class Arrays_EnBuyukEnKucukIntegerBul {
    public static void main(String[] args) {


        int[] dizi = {3, 8, 1, 5, 9};
        Arrays.sort(dizi);// sıralamak için kullanıırız :sort yapınca otomatik olarak sıralar[1,2,3,5,8]şeklinde
        System.out.println("en büyük element:"+dizi[dizi.length-1]);
        System.out.println("en küçük element :"+dizi[0]);





    }
}
