package JavaSoruÇözümleri;

import java.util.Arrays;

public class Soru_5_ArrayList {
    public static void main(String[] args) {

        //ismi getCount() olan bir method oluşturun.

       //Parametre olarak bir String ArayList  ve  bir tane String

       // Return tipi int olmalı.



       // ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.


        //Örneğin;

        //ArrayList = Orange , Kiwi , Peach , Banana , Orange

       // String Orange:

       // Count = 2 olmalı. (Orange 2 kez yazılmış)
String []arr={"Orange","Kiwi","Peach","Banana","Orange"};
        System.out.println(getCount(arr));


    }
    public static String getCount(String[]arr){

        int count=1;
        String tekrar="";
        Arrays.sort(arr);
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equalsIgnoreCase(arr[i])){
                count++;
                tekrar=arr[i];
            }
        }
        return tekrar+" "+count+" kez yazılmış";
    }

}
