package Gun07;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class _09_OzelSoru {
    public static void main(String[] args) {

        // 3 kelimelik ismi olan kişinin ad,2.ad ve soyadını A.E.Y.şeklinde yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print(" TAM AD:");
        String tamAD = oku.nextLine();

        char ilkHarf =tamAD.charAt(0);
        int bosluk1= tamAD.indexOf(" ");
        char ad2=tamAD.charAt(bosluk1+1);

        int bosluk2= tamAD.lastIndexOf(" ");
        char soyad=tamAD.charAt(bosluk2+1);
        System.out.println(ilkHarf+"."+ad2+"."+soyad+".");
/***********************************************************************/

        Scanner okuStr8=new Scanner(System.in);
        System.out.print("adinizi giriniz");
        String cumle8=okuStr8.nextLine();

        int boslukk1=cumle8.indexOf(" ");
        int boslukk2=cumle8.indexOf(" ",boslukk1+1);
        String Ilkharf=cumle8.substring(0,1);
        String IkinciHarf=cumle8.substring(boslukk1+1,boslukk1+2);
        String ucuncuharf=cumle8.substring(boslukk2+1,boslukk2+2);

        String kisatlma= ilkHarf+"."+IkinciHarf+"."+ucuncuharf+".";
        System.out.println("kisatlma = " + kisatlma);






    }
}
