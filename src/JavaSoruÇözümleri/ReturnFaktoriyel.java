package JavaSoruÇözümleri;

import java.util.Scanner;

public class ReturnFaktoriyel {
    public static void main(String[] args) {


        //kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını(faktöriel)
        //bir fonksiyonda buldurun,bunun sonucunu main de tek mi çift mi olduğunu yazdırınız


        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi=oku.nextInt();

        int carpim=faktoriyel(sayi);
        System.out.println("çarpım="+carpim);//***Main kısmı burası

        if (carpim%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

    }
    public static int faktoriyel(int sayi)

    {
        int carpim=1;
        for (int i = 1; i <=sayi ; i++) {
            carpim=carpim*i;

        }
        return carpim;




    }
}
