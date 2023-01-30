package JavaSoruÇözümleri;

import java.util.Scanner;

public class Return_2_sayininToplami {
    public static void main(String[] args) {


        //kullanıcının gireceği iki sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.


        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayı giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2.sayıyı giriniz:");
        int sayi2 = oku.nextInt();

        int toplam = toplamBul(sayi1, sayi2);
        System.out.println("toplam=" + toplam);

    }

    public static int toplamBul(int sayi1, int sayi2)

    {
        return (sayi1+sayi2);


    }
}
