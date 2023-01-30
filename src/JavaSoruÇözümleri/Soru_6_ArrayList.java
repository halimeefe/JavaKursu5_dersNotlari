package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Soru_6_ArrayList {
    public static void main(String[] args) {


        //getSum() isminde bir method oluşturun.

        //Parametresi ArrayList olmalı

        //Return tipi int olmalı.

        //ArrayList teki tüm sayıları birbiri ile toplayın.

        // return olarak toplam sonucu döndürün.

        // Örneğin;

        //Arraylist = 1,2,3,4,5

        // return 15 olmalı
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        System.out.println(getSum(list));


    }

    public static int getSum(ArrayList<Integer> list)
    {

        int toplam = 0;
        for (Integer integer :list) {
            toplam += integer;

        }
        return toplam;
    }

}























