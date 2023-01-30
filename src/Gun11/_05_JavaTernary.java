package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {

        // SORU: GİRİLEN BİR SAYININ SIFIR MI, NEGATİF Mİ,POZİTİF Mİ
        // OLDUĞUNU TERNARY OPERATÖR İLE YAZDIRINIZ.


        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi=oku.nextInt();


        System.out.println(   sayi==0 ? "sıfır ":( sayi >0 ? "pozitif":"negatif")  );







    }
}
