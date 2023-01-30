package Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {




        try { // hata bölgesini try {} parantezine aldık  // HATA OLUNCA UYARI VERSİN KIRILIP ÇIKMASIN
            Scanner oku=new Scanner(System.in);

            System.out.print("sayı1");
            int sayi1=oku.nextInt();

            System.out.print("sayi2:");
            int sayi2=oku.nextInt();

            int bolum= sayi1 / sayi2;
            System.out.println("bolum:"+bolum);


        }
        catch (Exception hata){  // hata mesajlarını yakaladım ve hata isimli exceptıon cinsinden değişkene attım

            System.out.println("hata:"+hata.getMessage()); // MESAJ HATADA VE HATA.GETMESSAGE YAZIP OKUTURUZ
            System.out.println("lütfen tekrar deneyiniz");// bu kısmın devamı için en üstte for yada while
                                                          // döngüsünü kullanıp kullanıcıyı doğru sayı girmeye
                                                          // yönlendirebiliriz
        }
        System.out.println("program bitti");
    }

}
