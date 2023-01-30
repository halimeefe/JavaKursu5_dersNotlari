package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //  Girilen bir Stringin son harfini yazdırınız.


        Scanner oku=new Scanner(System.in);

        System.out.print("CUMLE GİRİNİZ:");
        String cumle=oku.nextLine();

        //01234
        //BİR CÜMLENİN YADA KELİMENİN SON HARFİNİ OKUTMAK İSTERSEK UZUNLKUK -1 DERİZ
        //LENGHT -1
        int uzunluk=cumle.length();
        char sonHarf= cumle.charAt(uzunluk-1);

        System.out.println("sonHarf:"+sonHarf);

        // 2.yöntem
        System.out.println("sonHarf ="+cumle.charAt(cumle.length() -1) );





    }
}
