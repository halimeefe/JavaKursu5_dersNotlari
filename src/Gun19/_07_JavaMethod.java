package Gun19;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {

        // mainde 20 elemanlı bir diziyi tanımlayınız
        // daha sonra bir fonksiyona göndererek random 100 e kadar olan sayılarla
        // doldurunuz ve aynı fonksiyonda yazdırınız.


        int[] dizi = new int[20];// mainde tanımlandı
        diziDoldurYazdir(dizi); // ** FONKSİYON BU KISIMDIR**

    }
    public static void diziDoldurYazdir(int[]sayilar){// ** PARAMETRESİ İNT SAYILAR  **//
        for (int i = 0; i < sayilar.length; i++) {  // **SAYILAR PARAMETRESİNDE SAYILARI RANDOM SEÇTİK VE
            sayilar[i]=(int)(Math.random()*100);  //** DİZİ DOLDUR YAZDIR FONKSİYONUNDA DOLDURDUK


        }Arrays.sort(sayilar);// küçükten büyüğe sıralıyor
        System.out.println( "sayılar:"+Arrays.toString(sayilar));







    }
}
