package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class _04_JavaTryCatch {
    public static void main(String[] args) {


        System.out.println("program başladı");

        try {
            Scanner oku=new Scanner(System.in);

            System.out.print("sayi1");
            int sayi1=oku.nextInt();

            System.out.print("sayi2:");
            int sayi2=oku.nextInt();

            int bolum=sayi1/sayi2;
            System.out.println("bolum:"+bolum);

         //   String kelime=""; //genel hataya düşmesi için yapıldı
         //   kelime.charAt(3);


        }catch (InputMismatchException ex)//belirli hatalarda kullanıyoruz HARF YADA KARAKTER GİRME
        {
            System.out.println("lütfen sayı giriniz:");
        }
        catch (ArithmeticException ex)// belirli hatalarda kullanılır yani 0 girmesin
        {
            System.out.println("SIFIRA BÖLME HATASI");
        }
        catch (Exception ex)// yukarıdakilerin dışındaki hatalar için
        {
            System.out.println("hata oluştu"+ex.getMessage());
        }
        System.out.println("program bitti");
        }
    }

