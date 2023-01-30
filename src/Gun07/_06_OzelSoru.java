package Gun07;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class _06_OzelSoru {
    public static void main(String[] args) {

        //Girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        Scanner input4 = new Scanner(System.in);
        System.out.print("En az 3 kelimelik cümle giriniz : ");
        String cumle4 = input4.nextLine();
        int ilkBosluk = cumle4.indexOf(" ");
        String ilkIkiKelime =cumle4.substring(0,ilkBosluk)+" "+cumle4.substring
                (ilkBosluk+1,cumle4.indexOf(" ",ilkBosluk+1) );
        System.out.println("İlk iki kelime = " + ilkIkiKelime);










    }
}
