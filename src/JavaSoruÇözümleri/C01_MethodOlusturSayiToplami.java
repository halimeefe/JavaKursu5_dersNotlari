package JavaSoruÇözümleri;

import java.util.Scanner;

public class C01_MethodOlusturSayiToplami {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayı alıp bunların toplamını yazdıran bir method oluşturun


        isteToplaYazdir();



    }
    public static void isteToplaYazdir(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz:");

        double s1=scan.nextDouble();
        double s2=scan.nextDouble();

        System.out.println("girilen sayıların toplamı:"+(s2+s1));
        }
    }







