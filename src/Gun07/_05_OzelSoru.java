package Gun07;

import java.util.Scanner;

public class _05_OzelSoru {
    public static void main(String[] args) {

        // Girilen bir cümledeki ilk kelimeyi yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz:");
        String cumle=oku.nextLine();

        int boslukindex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0,boslukindex);
        System.out.println("İlk KELİME:"+ilkKelime);







    }
}
