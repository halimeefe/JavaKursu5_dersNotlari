package Gun13;

import java.util.Scanner;

public class  _06_DoWhile {
    public static void main(String[] args) {

        // while ın tersi olur DOWHİLE

        // kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;

        do{ // döngü arası şart başta olmadığından
            // en az 1 kez çalışır, kontrol sonda//*****sayının başlangıç değeri plması gerektiği
            //*için  döngüye girmeden okuma yaptırdık
            //*
            System.out.print("sayı giriniz=");
            sayi=oku.nextInt();

            toplam=toplam+sayi;



        }while (sayi!=0);

        System.out.println("toplam = " + toplam);




        System.out.println("toplam ="+toplam);
    }
}
