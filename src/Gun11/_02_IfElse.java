package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {


        // otopark ücretleri:
        // 3 saate kadar 10 tl;5 saate kadar 15tl,5 den büyükse 20 tl dir.
        //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç saat kaldı:");
        int saat =oku.nextInt();

        if ( saat<=3 )
            System.out.println("10 tl");

        else

        if (saat <=5)
            System.out.println("15 tl");

        else

            System.out.println("20 tl");






    }
}
