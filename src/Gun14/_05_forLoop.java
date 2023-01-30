package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {

        // girilen bir sayıya (dahil)kadar olan sayıların çarpımını bulunuz
        // 2. bölüm: çarpımın değeri 10000 i geçtiğinde işlem sonlansın.


        Scanner oku = new Scanner(System.in);

        System.out.print("sayı giriniz:");
        double sayi = oku.nextInt();
        double carpim=1;

        for (double i =1; i<=sayi;i++) {
            carpim = carpim * i;


            if (carpim > 10000) {
                System.out.println("break çalıştı");
                break;

            }
        }
        System.out.println("sonuç=" + carpim);

        // ***50 sayısını verirsek hata verebilir
        // çünkü büyük sayı gelme ihtimali var
        //bu yüzden long  yada double yapmalıyız.








    }
}
