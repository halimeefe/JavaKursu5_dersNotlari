package Gun01;


import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.Map;

public class _02_Dnm {
    public static void main(String[] args) {


        // Ornek 5 : Verilen bir Array de tekrar eden elemanlari yazdirin..

        int[] numbers2 = {2, 4, 6, 8, 4, 6, 10, 10};


        int sayac = 0;
        for (int i = 0; i < numbers2.length; i++) {

            if (numbers2[i] == numbers2[i+1]) {
                    sayac++;

                }
                System.out.println(numbers2[i] + sayac + "tane var");


            }

        }
    }





































