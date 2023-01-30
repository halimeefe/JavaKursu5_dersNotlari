package Gun01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Soruu {
    public static void main(String[] args) {

        // Soru : bir metod oluşturup bir HashSet i
// verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
// bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.




      HashSet<Integer>hs2=generateSet();
        System.out.println("hs2:"+hs2);






    }public static HashSet<Integer> generateSet()
    {
       Integer[]dizi={1,2,3,4,5,5,5,6,6,7,8,};
       HashSet<Integer>hs=new HashSet<>(Arrays.asList(dizi));
       return hs;




    }
}
