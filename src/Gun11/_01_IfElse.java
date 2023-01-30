package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının pozitif,negatif veya sıfır olduğunu yazdırınız.



        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi = oku.nextInt();

        if (sayi>0 )
            System.out.println("sayı pozitiftir");
        if (sayi<0)    // parayla değil istediğin kadar if kullan
            System.out.println("sayı negatiftir");
        else
            System.out.println("sıfır");




    }
}
