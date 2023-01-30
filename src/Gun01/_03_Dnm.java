package Gun01;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Dnm {
    public static void main(String[] args) {

        //  Ödev Soru3: Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
        // Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("lütfen pin kodu giriniz:");
        int pin1 = oku.nextInt();
        System.out.print("2.hakkınız:");
        int pin2 = oku.nextInt();
        System.out.print("Son hakkınız:");
        int pin3=oku.nextInt();

        if (pin1==pin2 && pin1== pin3) {
            System.out.println("tebrikler,başarılı bir giriş yaptınız");

        }
        else
            System.out.print("Kartınız bloke oldu");

    }

        }





























