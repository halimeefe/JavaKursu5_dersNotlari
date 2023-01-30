package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {

        //Ekrana 5 kez merhaba yazdırınız.

        int sayac=1;
        while (sayac<6)  // while : iken yap demektir:şartı yazıyoruz,dönme şartını
        {    // tekrarlanacaklar adımlar süslü parantezler içine yazılıyor
            // süslü parantezler arasına her döndükçe yapılacaklar yazılır

            System.out.println(sayac+".merhaba");

            sayac++;  // 1,2,3,4,5

        }
        System.out.println(" program bitti");
    }
}
