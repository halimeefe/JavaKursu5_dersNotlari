package JavaSoruÇözümleri;

import java.util.Scanner;

public class UlkeAdiHarfSiralama {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("ülke adı:");
        String str = oku.nextLine();


        for (int i =str.length(); i >=0 ; i--) {

            String ulkeAdi=str.substring(i);
            System.out.println(ulkeAdi);
        }



    }
}
