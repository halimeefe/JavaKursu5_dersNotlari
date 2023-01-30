package JavaSoruÇözümleri;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {


        //Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku = new Scanner(System.in);

        int toplam = 0;
        int sayac = 1;

        while (sayac <= 20) {

            System.out.print(sayac + ".sayı giriniz:");
            int sayi = oku.nextInt();

            if (sayi % 2 != 0) {
                toplam += sayi;
                sayac++;

            }


        }
        System.out.println("toplam:" + toplam);
    }
}








