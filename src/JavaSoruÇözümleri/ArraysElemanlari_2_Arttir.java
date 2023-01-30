package JavaSoruÇözümleri;

import java.util.Arrays;

public class ArraysElemanlari_2_Arttir {
    public static void main(String[] args) {



        //verilen bir int array in tüm elemanlarını 2 artırıp bize döndüren
        // bir method oluşturun.Eski array i yeni haliyle kaydedin.



           int[]dizi={2,4,6,8};
           for (int i=0; i<dizi.length;i++){

               dizi[i]=dizi[i]+2;

           }
        System.out.println(Arrays.toString(dizi));// 4,6,8,10 oldu sonuç

        dizi=elementleri2Artir(dizi);

        System.out.println(Arrays.toString(dizi));

    }
    public static int[]elementleri2Artir(int[]dizi){// eski arrayi döndürmek için

        for (int i=0; i< dizi.length;i++){

            dizi[i]=dizi[i]+2;

        }
        return dizi;// eski arrayi dödürmek için

    }
}
