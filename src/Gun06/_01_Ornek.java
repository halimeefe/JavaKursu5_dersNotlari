package Gun06;

import java.util.Scanner;

public class  _01_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan cadde,sokak,postaKodu(int) ve ülke şeklinde
        //adres bilgisi alarak yazdırınız.

        Scanner okuStr= new Scanner(System.in);// STRİNG OKUMALARI İÇİN,
        System.out.print("cadde:");

        String cadde =okuStr.nextLine();


        System.out.print("sokak:");
        String sokak =okuStr.nextLine();


        System.out.print("ülke:");
        String ulke =okuStr.next();


        Scanner okuInt= new Scanner(System.in);//İNT OKUMALARI İÇİN.



        System.out.print("posta kodu:");
        int postaKodu=okuInt.nextInt();

        System.out.println("adres:"+ cadde+" "+sokak+" "+postaKodu+" "+ulke);







    }

}
