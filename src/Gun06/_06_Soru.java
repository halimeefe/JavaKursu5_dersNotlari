package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        //Girilen bir ad soyadı "Ismet Temur" I.T şeklinde yazdırınız.

        Scanner oku= new Scanner(System.in);

        System.out.print(" ad ve soyad:");
        String adSoyad =oku.nextLine();// adSoyad veri olarak alındı

        //Ismet Temur ->I.T. -> I-> charAt (0)I.
        //Indexof("") -> boşluğun indexini veriyor,bunun bir fazlası charAt() -> T yi veriyor


        char ilkHarf= adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf =adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");








    }
}
