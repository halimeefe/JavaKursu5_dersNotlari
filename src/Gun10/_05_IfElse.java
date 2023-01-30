package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {

        //Girilen bir Stringin uzunluğu 10 dan büyükse ve string içinde
        //"study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        //hayır yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("STRİNG GİRİNİZ:");
        String cumle =oku.nextLine();

        int uzunluk=cumle.length();
        boolean varMi=cumle.contains("study");

        if (uzunluk >10 && varMi)
            System.out.println("evet");
        else
            System.out.println("hayır");

        //2. yöntem
        //boolean varMi = cumle.toLowerCase().contains("study");

        Scanner okuyucu =new Scanner(System.in);
        System.out.print("CÜMLE GİRİNİZ:");
        String cumlee=oku.nextLine();

        if (cumlee.length() >10 && cumlee.toLowerCase().contains("study"))
            System.out.println("EVET");
        else
            System.out.println(" hayır");









    }
}
