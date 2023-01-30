package Gun02;

import java.util.Scanner;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        // \n ->yeni satır açıyor, alt satıra geçiyor
        //  \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
        //  \b -> back-space bir karakter geri siler
        //  \" -> tırnak yazmak için kullanılıyor
        //  \\  -> \ yazılacak ekrana
        // \r  -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar



        System.out.println("MerhabaDünya");  // MerhabaDünya
        System.out.println("Merhaba \nDünya");  //Merhaba alt satıra geçer Dünya
        //print veya println  \ görünce bu ekrtana yazılacak bir karakter değil,
        //ayrı bir iş yapmam isteniyor,devam eden n karakterini görünce
        //ayrı işin alt satıra geçmek olduğunu anlıyor
        System.out.println("Merhaba\tDünya");  //Merhaba Dünya
        System.out.println("Merhaba\bDünya");  //MerhabDünya
        System.out.println("Merhaba\"Dünya");  //Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");  //Merhaba\Dünya
        System.out.println("Merhaba\rDünya");  // Dünya


        Scanner oku=new Scanner(System.in);
        System.out.print("not1 giriniz:");
        int not1= oku.nextInt();
        System.out.print("not2 giriniz:");
        int not2=oku.nextInt();
        System.out.print("not3 giriniz:");
        int not3= oku.nextInt();

      double top=not1+not2+not3;
     int ort=(int)top/3;
        System.out.print("ortalama puanınız:"+ort);




    }
}
