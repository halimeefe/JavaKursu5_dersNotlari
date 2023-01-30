package Gun10;

import java.util.Scanner;

public class  _01_IfElse {
    public static void main(String[] args) {

        // Girilen bir öğrencinin notuna göre 50 den büyük eşit ise geçtiniz
        // küçük ise kaldınız yazdırınız.
        //

        Scanner oku =new Scanner(System.in);
        System.out.print("Notu giriniz:=");
        int ogrNot =oku.nextInt();

        //1.Yöntem
        if (ogrNot>=50)
            System.out.println("GEÇTİNİZ");

        if (ogrNot<50)
            System.out.println("Kaldınız");

        //2. yöntem

        if (ogrNot>=50)
            System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız");



    }
}
