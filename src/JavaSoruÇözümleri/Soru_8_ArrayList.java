package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru_8_ArrayList {
    public static void main(String[] args) {




        //İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //Arraylist'te s1'i s2 olarak değiştirin
        // Return String arrayList
        //Örneğin;
        //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        // s1 = blue
        //s2 = yellow
        //Tüm blue 'ları yellow'a dönüştürün.
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list,"yellow","red","blue","red","blue");
        for (String s:changeArrayList(list)){
            System.out.print(s+" ,");
        }

    }
    public static ArrayList<String>changeArrayList(ArrayList<String>list)
    {
        ArrayList<String >changedList=new ArrayList<>();
        for(String s: list){
            if (s.equalsIgnoreCase("blue"))
                s="yellow";
            changedList.add(s);

        }return changedList;
    }
}




