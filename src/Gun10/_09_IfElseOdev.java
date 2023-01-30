package Gun10;

import java.util.Scanner;

public class _09_IfElseOdev {
    public static void main(String[] args) {


        // yan yana aralarında bir boşlukla  girilen  3 int sayının
        //toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayıları 1 boşluk bırakarak giriniz:");
        String sayilar=oku.nextLine();

        int bos1Ind= sayilar.indexOf(" ");
        int bos2Ind= sayilar.lastIndexOf(" ");

        int sayi1=Integer.parseInt( sayilar.substring(0,bos1Ind) );
        int sayi2=Integer.parseInt( sayilar.substring(bos1Ind+1,bos2Ind));
        int sayi3=Integer.parseInt( sayilar.substring(bos2Ind+1));

        if ((sayi1+sayi2+sayi3) % 2== 0)
            System.out.println("Çift");
        else
            System.out.println("Tek");










    }
}
