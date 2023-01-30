package JavaSoruÇözümleri;

import java.util.Scanner;

public class C02_MethodOlusturIkiSayininCarpimi {
    public static void main(String[] args) {


       //  main method içerisindee kullanıcıdan iki sayı alın
        // bu iki sayıyı parametre olarak kabul edip,
        //çarpımlarını bize döndüren bir method oluşturun.


        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz:");
        double s1=scan.nextDouble();
        double s2=scan.nextDouble();
        System.out.println(carpimMethodu(s1,s2));
    }
    public static double carpimMethodu(double s1,double s2){
        System.out.println("çarpım method'u çalıştı");
        return s1*s2;
    }
}
