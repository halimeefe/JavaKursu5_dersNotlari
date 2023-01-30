package JavaSoruÇözümleri;

import java.util.Scanner;

public class BirlerOnlarYuzler {
    public static void main(String[] args) {






        // Girilen 3 basamaklı bir sayının birler,onlar ve yüzler basamağını bulunuz.


        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı sayı giriniz:");
        int sayi =oku.nextInt();

        int birlerbasamagi=sayi%10;
        int onlarbasamagi=(sayi/10)%10;
        int yuzlerbasamagi=sayi/100;
        System.out.println("birler basamağı:"+birlerbasamagi);
        System.out.println("onlar basamağı:"+onlarbasamagi);
        System.out.println("yüzler basamağı:"+yuzlerbasamagi);



    }
}
