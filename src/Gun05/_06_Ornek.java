package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Bir karenin kenarını kullanıcıdan isteyip cevresini ve alanını bulunuz ve yazdırınız
        // cevre=a+a+a+a
        //alan= a*a

        Scanner oku = new Scanner(System.in);
        System.out.print("Karenin bir kenar ölçüsü:");
        int kenar = oku.nextInt();
        int cevre = kenar + kenar + kenar + kenar;
        int alan = kenar * kenar;
        System.out.println("cevresi =" + cevre);
        System.out.println("alanı=" + alan);


    }
}
