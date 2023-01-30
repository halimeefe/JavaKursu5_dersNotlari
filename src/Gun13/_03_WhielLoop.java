package Gun13;

import java.util.Scanner;

public class _03_WhielLoop {
    public static void main(String[] args) {


        // Girilen 20 sayının toplamının sonucunu yazınız



        Scanner oku =new Scanner(System.in);


        int sayac=1;
        int toplam=0;
        while (sayac<=3)
        {

            System.out.print("sayı giriniz:");
            int sayi=oku.nextInt();

            toplam = toplam + sayi;

            sayac++;
        }
        System.out.println("toplam="+toplam);




    }
}
