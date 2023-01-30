package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // kullanıcının  gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdıınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("sayi1:");
        int sayi1=oku.nextInt();

        System.out.print("sayi2:");
        int sayi2= oku.nextInt();

        System.out.println("sayı1 eşit mi sayı2 :"+(sayi1==sayi2));

        //2. yöntem
        boolean esitMi=(sayi1==sayi2);
        System.out.println("eşit mi? :"+esitMi);




    }
}
