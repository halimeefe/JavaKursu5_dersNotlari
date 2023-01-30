package Gun05;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        //Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı? "yazdırın.
        // Varsa true, yoksa false olarak konsoldan cevap veriniz.Boolean ı yazdırınız.



        Scanner bankaHesabi = new Scanner(System.in);
        System.out.print(" Bir Banka Hesabiniz Var mi = ");
        boolean hesapVarmi = bankaHesabi.nextBoolean();
        System.out.println("Islem sonucu = " + hesapVarmi);
        System.out.println(" ");



























    }
}
