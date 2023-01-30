package Gun26._04_Ornek;

import Gun25._05_Soru.Calisan;

import java.util.ArrayList;

public class ElektrikHesabi {



    double birimfiyat=0.7;
    double fatura=0;
    int toplamTuketim=0;

    public void tuketimEkle(int aylikTuketim)// her ayki gelen faturayı
    {                                       //toplayıp ekliyor
                                             //içinde biriktiriyor
        toplamTuketim+=aylikTuketim;
    }

    public void toplamTuketimYaz()// yukardaki tüketim ekle yi burda yazdırdık
    {
        System.out.println("toplam tüketim:"+toplamTuketim);

    }
    public void faturaYaz(String isim)// faturayı hazırladık
    {
        double fatura=toplamTuketim*birimfiyat;// toplam tüketimi birim fiyatla çarptık
        System.out.println("***********************");
        System.out.println("   faturanız   ");
        System.out.println("**************************");
        System.out.println("müşteri:"+isim);
        System.out.println("toplam tüketim:"+toplamTuketim);
        System.out.println("toplam tutar:"+Math.round(fatura));//çok kusuratlı çıkmamamsı için yuvarladık math.raound ile
        System.out.println("***********************");


    }
}




























