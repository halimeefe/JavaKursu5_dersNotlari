package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {

        //Girilen bir sayının tek mi çift mi olduğunu yazdırınız



        Scanner oku =new Scanner(System.in);
        System.out.print(" Sayı giriniz:");
        int sayi= oku.nextInt();
        int kalan =sayi%2;// girilen sayının ikiye bölümünden kalan 0 a eşitse çift
        // değilse tektir

        if (kalan==0)
            System.out.println("Sayı çifttir");
        else
            System.out.println("Sayı tektir");







    }
}
