package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TekSayiElemanlariAraylisteAtama {
    public static void main(String[] args) {

        // Kullanıcıdan alcağınız6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı bir diziye (Array list) atayarak yazdırınız.


        Scanner sc=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("sayı giriniz:");
            dizi[i]=sc.nextInt();


        }
        System.out.println(Arrays.toString(dizi));

        ArrayList<Integer> tek=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2!=0){
                tek.add(dizi[i]);
            }

        }
        System.out.println(tek);







    }
}
