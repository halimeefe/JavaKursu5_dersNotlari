package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {

        // girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        // kullanıcı bilirse  tebrikler yazdırınız.


        Scanner oku= new Scanner(System.in);
        System.out.print("üretilecek sayı sınırı:");
        int sinir=(int)oku.nextInt();

        int tutulanSayi=(int) (Math.random()*sinir);

        System.out.print("tahmininiz:");
        int tahmin= oku.nextInt();

        if (tahmin== tutulanSayi)
            System.out.println("tebrikler" );
        else
            System.out.println(" bilemedin ki bilemedinki ");







    }
}
