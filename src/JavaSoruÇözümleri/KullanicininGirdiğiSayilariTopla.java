package JavaSoruÇözümleri;

import java.util.Scanner;

public class KullanicininGirdiğiSayilariTopla {
    public static void main(String[] args) {


        // Ornek 3 : Kullanici tarafindan girilen 5 pozitif 0 dan büyük sayinin toplamini hesaplayan
        //Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...

        Scanner oku = new Scanner(System.in);


        int sayi,toplam=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+".sayiyi gir : ");
            sayi= sc.nextInt();
            if (sayi<0){
                i--;
                continue;

            } else if (sayi>100) {
                System.out.println("hatali giris yaptiniz");
                break;
            }
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);



    }
}
