package JavaSoruÇözümleri;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class S2_MethodString {
    public static void main(String[] args) {


        //"orta kelime " isminden bir method oluşturun.
        // bu method stringi parametre olarak almalı.
        // cümle ve dizelerde ortada bulunan kelimeleri bulmalı.
        // ortadaki kelimeyi return yapınız.


       Scanner sc=new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle=sc.nextLine();


        System.out.println(ortaKelime(cumle));

    }

    public static String ortaKelime(String cumle) {
        int ilkBosluk=cumle.indexOf(" ");
        int sonBosluk=cumle.lastIndexOf(" ");

        return cumle.substring(ilkBosluk+1,sonBosluk);



    }




    }
















