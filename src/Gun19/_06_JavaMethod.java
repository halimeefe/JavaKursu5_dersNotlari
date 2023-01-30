package Gun19;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);
     // kullanıcıdan sayı alarak onu tek mi çift mi yazdıralım
        tekMiCiftMiOku();




    }
    public static void tekMiCiftMi(int sayi){// **parametresi int sayi dır//**buradaki sayıyı konsoldan değil biz gireriz,bu yüzden parametre yazarız
        if (sayi%2!=0)
            System.out.println("tek");
        else System.out.println("çift");

    }
    public static void tekMiCiftMiOku(){//** kullanıcıdan sayı aldığımız zaman buradaki parametre parantezi boş bırakılır
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi=oku.nextInt();

        tekMiCiftMi(sayi);//**konsoldan işlem yapılınca main metoda değil buraya yazarız metodu
    }

}
