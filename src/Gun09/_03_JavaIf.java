package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.


        Scanner oku =new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        int sayi1=oku.nextInt();

        System.out.print("2.sayıyı giriniz:");
        int sayi2=oku.nextInt();

        if (sayi1>sayi2)// buradaki normal parantezler şart
            System.out.println("sayi1 büyüktür");
        if(sayi2>sayi1)
            System.out.println("sayi2 büyüktür");
        if(sayi1==sayi2)
            System.out.println("sayı1 eşittir sayi2");
        // iki tane alta alta sout olursa süslü parantez koyarız






    }
}
