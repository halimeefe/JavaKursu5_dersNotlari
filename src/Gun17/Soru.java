package Gun17;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {


        // verilen bir string ifadenin palindrom olup olmadığını test eden bir program yazınız

        String str = "nalan";
        String xx = "";
        for (int i = str.length() - 1; i >= 0; i--)
            xx = xx + str.charAt(i);
        if (str.equals(xx))
            System.out.println("polindromdur");
        else
            System.out.println("Polindrom değildir");

        //**********************************************//

            // Ödev Soru 1: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.

        }
    }////



//// Ödev Soru3: Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
//// Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.


















