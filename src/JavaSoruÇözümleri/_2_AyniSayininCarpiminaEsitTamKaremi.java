package JavaSoruÇözümleri;

import java.util.Scanner;

public class _2_AyniSayininCarpiminaEsitTamKaremi {
    public static void main(String[] args) {



        // girilen bir sayının ,2 aynı sayının çarpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim-> 2*2 bu tam karedir
        // 5 girdim-> değildir
        // 9 girdim ->3*3

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi = oku.nextInt();

        int sayac = 0;
        int arananRakam=0;//************2. yöntem olarak buraya boolean=bulundu=false yazabiliriz

        while (sayac < sayi) {
            System.out.println("sayac:"+sayac);

            if (sayac * sayac == sayi) {
                System.out.print("tam karedir");
                arananRakam=sayac;//*******************2.yöntem olarak boolean bulundu=true yazabiliriz
                break;  // *************break yazdığımızda işlem tamamlanınca döngüden çıkar

            }

            sayac++;

        }if (arananRakam==0){//*******************2. yöntem boolean bulundu==false yazabiliriz.
            System.out.println("tam kare değildir");
        }
    }








    }

