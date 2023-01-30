package Gun01;


import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

//AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu yazınız



    HashSet<Integer> hs=new HashSet<>();

      addElements(hs,1,2,3,4,5,6,7,8,9);
        System.out.println("hs:"+hs);



    }public static void addElements(HashSet<Integer>hs,Integer...sayilar)

    {    hs.addAll(Arrays.asList(sayilar));

    }
}





































