package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Soru_7_ArrayList {
    public static void main(String[] args) {


        //getLength() isminde bir method oluşturun.

       // Parametre olarak String ArrayList

        //Return tipi Integer ArrayList

        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

                //Tüm elementlerin uzunluğunu döndürün

               // Örneğin;

       // ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"

       // Tüm Stringlerin uzunluklarını yazdırın;

       // cevap: 10 ,  8 , 4 , 7 , 6 olmalı


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Newjersey","Newyork","Ohio","Florida","Boston");
        for (Integer i:getlenght(list)){
            System.out.print(i+" ");
        }

    }
    public static ArrayList<Integer>getlenght(ArrayList<String>list)
    {
        ArrayList<Integer>listInt=new ArrayList<>();
        for(String s:list){
            listInt.add(s.length());
        }
        return listInt;


    }
}
