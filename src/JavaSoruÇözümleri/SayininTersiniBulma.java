package JavaSoruÇözümleri;

import java.util.Scanner;

public class SayininTersiniBulma {
    public static void main(String[] args) {


        //Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 oolan sayı elde edilecek




        Scanner oku=new Scanner(System.in);

        System.out.print("sayı giriniz:");

        int sayi= oku.nextInt();

        while (sayi>0) {
            System.out.print(sayi % 10);
            sayi /= 10;

        }
        System.out.println(" sayının tersten yazılışı");

    }
}
