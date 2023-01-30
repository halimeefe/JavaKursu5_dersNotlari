package JavaSoruÇözümleri;

import java.util.Scanner;

public class ContinuePasGec {
    public static void main(String[] args) {





        //kullanıcıdan 5 sayı isteyin
        //bu sayılardan 6 ile 10 arası hariç diğerlerini toplasın

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i <=5; i++) {
            System.out.print("sayı giriniz:");
            int sayi=oku.nextInt();



            if (sayi>=6 && sayi <=10)
                continue;
            toplam+=sayi;
            System.out.println(toplam);

        }


    }
}
