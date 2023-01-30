package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;

public class ArayiArrayListeDönüştürme {
    public static void main(String[] args) {

        // BİR ARAYİ NASIL ARAYLİSTE DÖNÜŞTÜRÜRÜZ



        String[]arr={"java","phyton","c++"};
        ArrayList<String>dizi=new ArrayList<>();

       dizi.addAll(Arrays.asList(arr));//  YENİ TANIMLADIĞIMIZ ARAYLİSTİN İÇİNE ADALL KULLARAK VE ASLİST YAPARAK
                                       // ARR DEKİ ELEMANLARI ATAYABİLİRİZ
        System.out.println("dizi="+dizi);


    }
}
