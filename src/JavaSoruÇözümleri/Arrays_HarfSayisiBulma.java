package JavaSoruÇözümleri;

import java.util.Arrays;

public class Arrays_HarfSayisiBulma {
    public static void main(String[] args) {



        // verilen cümledeki harf sayısını bulma:kaç tane e harfi var

        String dizi="java gerçekten çok çok güzel";

        String[]harfler=dizi.split(""); //hiçlik işareti harflerin arasına virgül koyar ve ayırır.
        System.out.println(Arrays.toString(harfler));

        int sayac=0;
        for (int i=0;i< harfler.length;i++){
            if (harfler[i].equalsIgnoreCase("e")){
                sayac++;

            }
        }
        System.out.println("cümledeki e sayısı:"+sayac);

    }
}
