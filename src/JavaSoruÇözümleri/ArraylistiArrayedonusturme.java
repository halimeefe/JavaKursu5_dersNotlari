package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistiArrayedonusturme {
    public static void main(String[] args) {




        //ARAY LİSTİ NASIL ARAYE DÖNÜŞTÜRÜRÜZ


        ArrayList<String>dizi=new ArrayList<>(Arrays.asList("java","Phyton","C++"));

        String []str=new String[dizi.size()];
        dizi.toArray(str);
        System.out.println("str:"+Arrays.toString(str));

    }
}
