package JavaSoruÇözümleri;

import java.util.Arrays;

public class Sor_3_2DArray {
    public static void main(String[] args) {


        //Aşağıdaki gibi olan bir 2D String Array oluşturunuz.

         //[{"new jersey","atlanta","ohio"} ,

        //{"Pittsburgh" ,"ohio","new york","ohio"} ,

       // {"ohio","new york"}]Bütün ohio'ları Florida'yla değiştiriniz.
        //Array'i yazdırınız.


        String[][]eyalet={{"new jersey","atlanta","ohio"},{"Pittsburgh" ,"ohio","new york","ohio"},{"ohio","new york"}};


        for (int i = 0; i < eyalet.length; i++) {
            for (int j = 0; j < eyalet[i].length; j++) {
                if (eyalet[i][j].equalsIgnoreCase("ohio"))
                    eyalet[i][j]="florida";



            }
            System.out.println(Arrays.deepToString(eyalet));
        }








        }

    }













