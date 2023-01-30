package JavaSoruÇözümleri;



import java.util.Scanner;

public class KacBasamaklıSayi {
    public static void main(String[] args) {


        //girilen sayının kaç basamaklı olduğunu yazdırınız.


        Scanner oku=new Scanner(System.in);

        int basamaksayisi=0;
        System.out.print("sayı giriniz:");

        int sayi=oku.nextInt();

        while (sayi>0){


            sayi= sayi / 10;
            basamaksayisi++;

        }
        System.out.println(" basamak sayısı:"+basamaksayisi);

    }




}
