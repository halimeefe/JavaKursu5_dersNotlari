package JavaSoruÇözümleri;

import java.util.Arrays;

public class Arrays_ElemanlariSagaKaydir {
    public static void main(String[] args) {

        // Verilen bir array deki tüm elementleri bir sağa kaydırıp,
        //son daki elementi de başa taşayacak bir method oluşturun,
        //array i yeni haliyle kaydedin

        int[] dizi = {4, 5, 6, 7};
        dizi=sagaKaydir(dizi);
        System.out.println(Arrays.toString(dizi));

    }

    public static int[]sagaKaydir(int[]dizi){

        int bosKova=dizi[dizi.length-1];// son elementi boş kovaya koyduk
        for (int i=dizi.length-2; i>=0; i--){

            dizi[i+1]=dizi[i];

        }
        dizi[0]=bosKova;

        return dizi;


    }
}
