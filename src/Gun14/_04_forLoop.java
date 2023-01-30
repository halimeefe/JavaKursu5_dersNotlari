package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {

        // kullanıcının gireceği bir rakama kadar
        // olan sayıların toplamını bulunuz



        Scanner oku = new Scanner(System.in);

        System.out.print("sayı giriniz:");
        int sayi = oku.nextInt();
        int toplam=0;// 5 ->1,2,3,4,5,

        for (int i =1; i<sayi;i++)
            toplam=toplam+i; //-->toplam+=i  kısa yazılışıdır.*********

            System.out.println("toplam=" + toplam);





    }
}
