package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        //Girilen  2 tam sayıyı kullanıcıdan aldıktan sonra,
        // toplama için T, Çıkarma için Ç, çarpma için P,bölme için B
        //harflerini yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.


        // 2 sayı aldıktan sonra ;
        //Toplama->T
        // Çıkarma -> Ç
        //Çarpma->P
        //Bölme->B

        Scanner oku =new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        int sayi1=oku.nextInt();

        System.out.print("2. sayıyı giriniz:");
        int sayi2=oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("çıkarma için Ç");
        System.out.println(" Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz:");
        Scanner okuStr=new Scanner(System.in);
        String secim =okuStr.next();

        // merdivenli if,ladder if
        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam="+(sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Farkı="+(sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("p"))
                    System.out.println("Çarpımı="+(sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bölüm ="+(sayi1/sayi2));
                    else
                        System.out.println(" Yanlış seçim");










    }
}
