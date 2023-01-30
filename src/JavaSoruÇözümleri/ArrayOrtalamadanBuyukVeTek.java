package JavaSoruÇözümleri;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class ArrayOrtalamadanBuyukVeTek {
    public static void main(String[] args) {

        //kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        int[]sayilar=new int[7];
        int toplam=0;

        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print("sayı giriniz:"); // SAYILARI YAZ
            sayilar[i] =oku.nextInt();         // DİZİNİNİN 0,1,2,3,4,5,6 ELEMANLARINI OKUR
            toplam=toplam+sayilar[i];          // YAZILAN SAYILARI TEKER TEKER TOPLAR
        }

         int ort=toplam/ sayilar.length;
         int ortalamadanBuyukVeTek=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>ort && sayilar[i]%2 !=0)
                ortalamadanBuyukVeTek++;

        }
        System.out.println("ortalama:"+ort);
        System.out.println("ortalamadan büyük ve tek sayılar:"+ortalamadanBuyukVeTek);

    }
}
