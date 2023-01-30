package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru_5_HashSet {
    public static void main(String[] args) {

//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//
//        Store all the elements in one arraylist and print the arraylist
//
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//
//                **Örnek:**
//
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]


        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer>dizi = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                dizi.add(arr[i][j]);


            }


        }
        System.out.println(dizi);




}
}



