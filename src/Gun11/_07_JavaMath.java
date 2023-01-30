package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {

        // math max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz


        Scanner oku=new Scanner(System.in);
        System.out.print("sayi1:");
        int a= oku.nextInt();

        System.out.print("sayı2:");
        int b= oku.nextInt();

        System.out.print("sayi3:");
        int c= oku.nextInt();

        System.out.println("en büyük sayi="+ Math.max ( a,Math.max(b,c)) );





    }
}
