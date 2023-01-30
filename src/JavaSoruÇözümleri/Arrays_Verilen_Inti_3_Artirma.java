package JavaSoruÇözümleri;

import java.util.Arrays;

public class Arrays_Verilen_Inti_3_Artirma {
    public static void main(String[] args) {



        //verilen bir int arrayin elemanlarını 3 artırın


        int[]dizi={2,3,4};
        dizi= ArraysElemanlari_2_Arttir.elementleri2Artir(dizi);

            System.out.println(Arrays.toString(dizi));


        for (int i=0; i<dizi.length;i++){

            dizi[i]=dizi[i]+2;

        }







    }
    }

