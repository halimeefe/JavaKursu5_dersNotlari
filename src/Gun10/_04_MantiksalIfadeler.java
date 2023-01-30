package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {

        //Girilen sayı pozitif ve tek ise,ekrana uygun sayı girildi
        //değilse uygun sayı girilmedi yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("SAYİ:");
        int sayi = oku.nextInt();

        // hem tek hem de pozitif -> sayi %2==1 && sayı >0

        if (sayi % 2 ==1 && sayi >0)
            System.out.println("UYGUN SAYI GİRİLDİ");
        else
            System.out.println("UYGUN SAYI GİRİLMEDİ");








    }
}
