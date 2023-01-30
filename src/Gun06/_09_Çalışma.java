package Gun06;

import java.util.Scanner;

public class _09_Çalışma {
    public static void main(String[] args) {

        //Girilen bir ad soyadı "İsmet Temur" I.T. gibi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve Soyadınız:");
        String adSoyad =oku.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int bosluk =adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(bosluk+1);
        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

        /***********************************************************************/


        Scanner oku1=new Scanner(System.in);

        System.out.print("adınız ve soyadınız:");
        String adSoyd=oku.nextLine();

        int bosIndex=adSoyd.indexOf(" ");

        String ad1=adSoyd.substring(0, bosIndex);
        String ad2 =adSoyd.substring(bosIndex+1);
        String soyad=adSoyd.substring(bosIndex+2);

        System.out.println("ad ="+ad1);
        System.out.println("ad 2="+ad2);
        System.out.println("soyad="+soyad);

        /***************************************************************/

        int sayi1=10;
        int sayi2=15;
        boolean buyukMu=sayi1>sayi2;
        System.out.println("BÜYÜK MÜ:"+ buyukMu);









    }

}
