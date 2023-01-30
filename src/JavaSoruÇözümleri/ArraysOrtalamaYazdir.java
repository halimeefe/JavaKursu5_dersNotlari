package JavaSoruÇözümleri;

public class ArraysOrtalamaYazdir {
    public static void main(String[] args) {




        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4

        //Array'in ortalamasını alınız.

        int[]dizi ={12,14,21,23,10,4};
        int toplam=0;
        int ortalama=toplam/6;
        for (int i=0; i<dizi.length;i++) {
            toplam = toplam + dizi[i];
        }
        ortalama=toplam/ dizi.length;   //6 YERİNE DİZİ.LENGTH YAZILABİLİR

        System.out.println("ortalama:"+ortalama);



    }
}
