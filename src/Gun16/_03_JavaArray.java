package Gun16;

public class _03_JavaArray {
    public static void main(String[] args) {


        int[] dizi=new int[5];//0,1,2,3,4,5 indexli 5 elemanlı dizi
        int[]dizi2={5,6,34,77,66};// 5elemanlı bir dizi,hem tanımladım hem de ilk değerlerini verdim

        String[]kelimeler =new String[5];// 5 tane kelime /cumle saklayabilen bir dizi değişkeni
        boolean[]dizi3=new boolean[5];// 5 tane boolean[true/ false] saklayabilen bir dizi
        double[]oranlar=new double[5];// 5 tane double saklayabilen bir dizi değişkeni


        for (int i = 0; i < dizi.length; i++) {// DEFAULT DEĞERİ 0 GELİR ÇÜNKÜ ELEMAN YÜKLEMEDİK
            System.out.println("dizi:"+dizi[i]);// HENÜZ DEĞER ATANMAMIŞ DEMEK


        }
        for (int i = 0; i < kelimeler.length ; i++) { // STRİNGİN KEİMELER DEFAULT DEĞERİ NULL ÇIKAR YANİ İÇİ BOŞ DEMEK
            System.out.println("kelimeler."+kelimeler[i]);// HENÜZ DEĞER ATANMAMIŞ DEMEK

        }
        for (int i = 0; i < oranlar.length; i++) {  //  DOUBLE DA DEFAULTU 0.0 GELİR
            System.out.println("oranlar:"+oranlar[i]);

        }
        for (int i = 0; i < dizi3.length ; i++) {// BOOLEAN DA DEFAULT DEĞERİ FALSE GELİR
            System.out.println("dizi3:"+dizi3[i]);// HENÜZ DEĞER ATANMADIĞI İÇİN



        }




    }
}
