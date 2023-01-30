package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;
        System.out.print("Toplama işlemi=");
        System.out.println("a+b sonucu => "+ (a+b));  //14

        System.out.print("Çıkartma işlemi=");
        System.out.println("a-b sonucu => "+ (a-b));// 4

        System.out.print("Çarpma işlemi=");
        System.out.println("a*b sonucu => "+ (a*b));//45

        System.out.print("Bölme işlemi=");
        System.out.println("a/b sonucu => "+ (a/b));//normal sonuç 1.8 , fakat noktadan sonraki kısım atılır sonuç 1 dir.

        // normal sonuc 1.8 ,fakat tam sayının tam sayıya bölümünde küsürat atılır.
        //bu sebeple sonuç 1 olur, yuvarlama yapmaz. çünkü int/int
        //tam sonuç istersen bir tanesini double çevirmen yeterli
        System.out.println("(double)a/b sonucu ="+ ((double )a/b));


        System.out.println(" Modül işlemi ");
        System.out.println("a % b sonucu = "+ ( a%b ) ); // 9%5 => 4
        System.out.println("b % a sonucu = "+ ( b % a)); // 5%9 => 5



        //    kısa önemli not !
        //   Modül   (%) 'de
        // sol büyük ise kalanı al
        // sol küçükse solundakini al
        // eşitse 0 dır








    }
}
