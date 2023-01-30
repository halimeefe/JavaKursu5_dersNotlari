package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız.


        Scanner oku =new Scanner(System.in);

        System.out.print("sayı giriniz:");
        int sayi=oku.nextInt();

        int kalan =sayi % 2 ; // bu 1 e  eşitse tekdir.

        System.out.println("tek mi :"+(kalan==1));// kalan 1 e eşit mi demek yani tek sayımı demektir.

        //2.yöntem
        System.out.println("tek mi :"+(sayi%2== 1));




    }
}
