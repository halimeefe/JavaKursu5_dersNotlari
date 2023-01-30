package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {


        // soru : 1 lerden 5 lere kadar çarpım tablosunu programlayın
        //1 x 1 =2 gibi







        for (int j=1; j<=5;j++ ){// j sayac 1 dir , BURADAKİ BİR BİRLERDEN ÇARPMAYA BAŞLAR 5 LER DAHİL

            for (int i=1; i<=10; i++)// i sayac 2 dir BURADAKİ BİR ORTADAKİ ÇARPAN SAYILARDIR 10 A KADAR
                System.out.println(j + "x"+i+"="+(j*i));// sayac ları çarptık

            System.out.println();// Bu arada boşluk bırakır

        }





    }
}
