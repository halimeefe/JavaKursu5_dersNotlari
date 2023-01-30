package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {

        //100 e kadar olan sayıların toplamını bulunuz
        //sayi girişi ,sayı okuma var mı yok
        //1+2+3+4+5+6+7+8+9+.....99+100



        int sayac=1;  // sayac i harfi ile gösterilir
        int toplam=0;
        while (sayac<=100)
        {

           toplam=toplam+sayac;
           sayac++;

        }

        System.out.println("toplam="+toplam);

        //***********************************************************//








    }
}
