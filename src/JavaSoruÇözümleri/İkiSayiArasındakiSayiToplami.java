package JavaSoruÇözümleri;

import java.util.Scanner;

public class İkiSayiArasındakiSayiToplami {
    public static void main(String[] args) {






        // kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerin toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=0;
        int toplam=0;


        while (sayac<=20){
            System.out.print("sayı giriniz:");
            int sayi=oku.nextInt();
            sayac++;


            if (sayi>=10 && sayi<=30){
                toplam=toplam+sayi;


            }
        }System.out.println("toplam="+toplam);




    }
}
