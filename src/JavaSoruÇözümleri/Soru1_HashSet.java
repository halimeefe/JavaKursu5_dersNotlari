package JavaSoruÇözümleri;

import java.util.Collections;
import java.util.HashSet;

public class Soru1_HashSet {
    public static void main(String[] args) {

//        Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//        hashset ; 4,2,3,1,7
//        cevap: 5

        HashSet<Integer> hs = new HashSet<>();
        Collections.addAll(hs, 4, 2, 3, 1, 7);


        totalCount(hs);

    }

    public static void totalCount(HashSet<Integer> hs) {
        System.out.println(hs.size());


}

}


