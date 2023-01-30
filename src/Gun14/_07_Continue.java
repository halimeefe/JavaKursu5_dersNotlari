package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {


        //continue  pass geç demek ama döngü devam eder
        // kullanıcıdan 5 sayı isteyiniz.
        // bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın

        Scanner oku=new Scanner(System.in);
        int toplam =0;
        for (int i=0; i<5;i++)
        {
            System.out.println(" bir sayı giriniz:");
            int sayi=oku.nextInt();

            if (sayi>=6 && sayi<=10)
                continue;
            toplam=toplam+sayi;
            System.out.println("toplam:"+toplam);

            // BREAK VE CONTINUE DÖNGÜLERİ ETKİLER
        }









    }
}
