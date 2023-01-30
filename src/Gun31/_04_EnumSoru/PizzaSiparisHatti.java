package Gun31._04_EnumSoru;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PizzaSiparisHatti {

    // Bir pizza sipariş hattı yapılmak isteniyor
    // Kullanıcıya pizza için 1-Small,2-Medium,3-Large,4-Goster
    //seçeneklerini bir menu şeklinde vererek ,verdiği pizzaları
    //bir ARRAYLİST E atınız.
    //göster (4)ü seçtiğinde her pizzadan kaçar tane sipariş
    //verdiğini bir metodda yazdırınız

    //TODO: HER PİZZA TİPİ İÇİN ÜCRET BELİRLEYEREK TOPLAM ÜCRETİ YAZDIRINIZ

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        ArrayList<Pizza> siparisler=new ArrayList<>();


        int  secim=0;

       do {
           menu();
            secim = oku.nextInt();
           switch (secim){
               case 1:
                   Pizza sp=new Pizza(PizzaSize.SMALL);
                   siparisler.add(sp);
                   break;
               case 2:
                   Pizza mp=new Pizza(PizzaSize.MEDIUM);
                   siparisler.add(mp);
                   break;
               case 3:
                   Pizza lp=new Pizza(PizzaSize.LARGE);
                   siparisler.add(lp);
                   break;
               case 4:siparisYazdir(siparisler);
               break;
           }

       } while (secim <= 4);

    }
    public static void menu() {
        System.out.println("**************PİZZA MENÜ**********");
        System.out.println("1-SMALL");
        System.out.println("2-MEDIUM");
        System.out.println("3-LARGE");
        System.out.println("4-İŞLEME AL VE SİPARİŞLERİ GÖSTER");
        System.out.println("5-ÇIKIŞ");
        System.out.print("LÜTFEN,SEÇİM YAPINIZ:");

    }
    public static void siparisYazdir(ArrayList<Pizza>siparisler){
        int s=0;
        int m=0;
        int l=0;
        for (Pizza p:siparisler){  //foreach ile siparişleri sıralarız
            if (p.size==PizzaSize.SMALL)s++;   //smalsa artır
            else
                if (p.size==PizzaSize.MEDIUM)m++;  //medıumsa artır
                else
                    if (p.size==PizzaSize.LARGE)l++; // large ise artır


        }
        System.out.println("****SİPARİŞLERİNİZ****");
        System.out.println("Small pizza count:"+s);
        System.out.println("medıum pizza count:"+m);
        System.out.println("large pizza count:"+l);

    }


}





