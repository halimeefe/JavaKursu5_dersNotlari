package Gun07;

import java.util.Scanner;

public class _01_OzelSoru {
    public static void main(String[] args) {


        //Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("AD GİRİN=");
        String ad =oku.nextLine();

        System.out.print("SOYAD GİRİN=");
        String soyAd=oku.next();

        String adSoyad=ad.concat(" "+soyAd);
        System.out.println("AD SOYAD:"+adSoyad);


        String adi = "İsmet";
        String soyad = "Temur";
        System.out.println("ad ve soyad = " + ad + " " + soyad);
        String tamAd = "ismet" + " " + "temur";
        System.out.println("tamAd = " + tamAd);





    }
}
