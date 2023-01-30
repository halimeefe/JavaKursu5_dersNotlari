package Gun07;

import java.util.Scanner;

public class _04_OzelSoru {
    public static void main(String[] args) {

        //girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku =new Scanner(System.in);
        System.out.print("Kelime Giriniz:");
        String kelime=oku.next();
        int uzunluk=kelime.length();
        char ilkHarf=kelime.charAt(0);
        char sonHarf=kelime.charAt(uzunluk-1);
        System.out.println("İlk Harf :"+ilkHarf);
        System.out.println("Son Harf:"+sonHarf);


        Scanner okuStr4 = new Scanner(System.in);
        System.out.println("kelime girin");
        String kelime1 = okuStr4.nextLine();
        String ilHarf = kelime1.substring(0, 1); //substring alarilig al burdan basla substring ilki alir sonu almaz
        String soHarf = kelime1.substring(kelime1.length() - 1);
        System.out.println("ilkHarf: = " + ilkHarf + "sonHarf:" + sonHarf);


    }
}
