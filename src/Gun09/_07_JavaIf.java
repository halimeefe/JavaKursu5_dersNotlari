package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {

        // Girilen bir cümledeki küçük veya büyük harfinin olup olmaadığını yazdırınız.
        // Var veya yok şeklinde yazdırın.


        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle=");
        String cumle=oku.nextLine();

        cumle=cumle.toLowerCase();// bütün büyük harfler küçük oldu

        if(cumle.contains("a"))
            System.out.println("EVET");

        if (! cumle.contains("a"))
            System.out.println("HAYIR");










    }
}
