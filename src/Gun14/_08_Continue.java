package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {


        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle = oku.nextLine();

        for (int i = 0; i < cumle.length(); i++) {// sıfırıncı indexten başlasın cümlenin uzunluğuna kadar devam et
            if (cumle.charAt(i) == ' ')// boşluğun charAtini pas geç
                continue;

            System.out.println(cumle.charAt(i));// 0 indexli den cumle.length-1 e kadar al
        }
    }
}









