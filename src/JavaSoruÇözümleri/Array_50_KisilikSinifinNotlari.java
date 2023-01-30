package JavaSoruÇözümleri;

import java.util.Scanner;

public class Array_50_KisilikSinifinNotlari {
    public static void main(String[] args) {

        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız.//deneme olarak 5 aldık

        int[] notlar = new int[5];

        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {   // NOTLARI TOPLAYACAĞIMIZ DİZİYİ TANIMLIYORUZ
            System.out.print("notu giriniz:");    //SADECE DERS NOTUNU GİRİYORUZ İNT OLARAK
            notlar[i] = oku.nextInt();            // NOTLARI OKUTUYORUZ

            toplam = toplam + notlar[i];           // NOTLARIN HER BİRİNİ TOPLUYORUZ,TOPLAMI BULUYORUZ

        }
        int ort = toplam / notlar.length;      // ORTALAMAYI BULUYORUZ
        int gecenler = 0;                      // GECENLERİ TANITIYORUZ
        for (int i = 0; i < notlar.length; i++) {  // KUTULARIN HEPSİNİ KONTROL ETTİĞİMİZ KISIM ORTALAMAYI BULMAK İÇİN
            if (notlar[i] > ort) {   // EĞER HERHANGİBİR NOT ORT. BÜYÜKSE ORTALAMADAN BÜYÜK OLSUN DEMEK
                System.out.println("ortalamadan büyük notlar:" + notlar[i]);// ORTALAMADAN BÜYÜK OLAN NOTU YZDIR
                gecenler++; // VE PEŞİNDEN GEÇEN SAYISINI SAYACA BAĞLAYIP BULMUŞ OLURUZ
            }
        }

        System.out.println("ortalama:"+ort);// ORT.SONUÇ
        System.out.println("geçenler:"+gecenler);//GECENLERİN SAYAC SONUCU





    }
}
