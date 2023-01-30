package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {


        // Girilen vize notu%50 ile final notu%50 ortalamasını alarak
        // ortalama 60 dan büyük eşit ise geçtiniz,tebrikler yazdıırnız
        //değilse bütünlemeye kaldınız şeklinde yazdırınız

        // 2 tane sınav oldun. topla 2 ye böl
        // ***final kelimesi java nın kendisine aittir.***//



        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notu giriniz=");
        int vizeNotu=oku.nextInt();

        System.out.print("Final Notu giriniz=");
        int finalNotu= oku.nextInt();

        double ortalamaNot=(vizeNotu+finalNotu)/2;

        if (ortalamaNot>= 60)
            System.out.println("Geçtiniz tebrikler");

        else
            System.out.println("Bütünlemeye kaldınız");










    }
}
