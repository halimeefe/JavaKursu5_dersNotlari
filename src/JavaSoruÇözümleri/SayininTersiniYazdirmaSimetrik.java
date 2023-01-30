package JavaSoruÇözümleri;

import java.util.Scanner;

public class SayininTersiniYazdirmaSimetrik {
    public static void main(String[] args) {


        //Girilen bir sayının tersi ile aynı olup olmadığını bulunuz.Yani simetrik sayı mı?



        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();
        while (sayi>0){
            System.out.print(sayi%10);
            sayi=sayi/10;

        }











    }
}
