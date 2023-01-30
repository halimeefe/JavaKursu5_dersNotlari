package Gun07;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class _03_OzelSoru {
    public static void main(String[] args) {

        //Girilen bir cümledeki A harfi sayısını bulunuz.
        //*Büyük küçük harf ayrımı olmadan.

   Scanner oku=new Scanner(System.in);
        System.out.print("CÜMLE GİRİNİZ:");
        String cumle=oku.nextLine();
        cumle=cumle.toLowerCase().replaceAll("[0-9]","").replace("a","0").replaceAll("[^0-9]","");
        int aSayisi=cumle.length();
        System.out.println("A sayısı:"+aSayisi);




        Scanner input2 = new Scanner(System.in);
        System.out.print("Cümleyi giriniz : ");
        String cumle2 = input2.nextLine();
        int cumle1Uzunluk = cumle2.length();
        String aHarfiSil = cumle2.toLowerCase().replaceAll("a","");
        int cumle2Uzunluk = aHarfiSil.length();
        System.out.println(cumle1Uzunluk-cumle2Uzunluk);
























}
            }
