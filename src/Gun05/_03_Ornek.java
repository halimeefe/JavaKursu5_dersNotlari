package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {



    //Kullanıcıdan adını ve soyadını alarak ekrana yazdırınız.

        Scanner okuyucu = new Scanner(System.in); // Okuma işlemini yapacak olan değişken tanımlandı
        System.out.print("ad  ve soyad giriniz="); // ekrana neyin girileceğini yazdık bilgilendirme
        String adSoyad = okuyucu.nextLine(); // okuma işlemi bu noktada yapılıyor
        System.out.println("adSoyad = " +adSoyad);// verinin gerçekten okunabildiğini
        // tekrar ekrana yazrak kontrol ettim.







    }
}
