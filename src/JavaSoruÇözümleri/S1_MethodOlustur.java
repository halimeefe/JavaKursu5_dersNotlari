package JavaSoruÇözümleri;

import java.util.Random;

public class S1_MethodOlustur {
    public static void main(String[] args) {


        //ismi "randomNum "olan bir method oluşturun.
        //parametre olarak "int max" almalı.
        //bu method, 0ile max arasında random bir değer döndürmelidir.
        // random numarayı döndürünüz.


        System.out.println(randomNum(10));

    }
    public static int randomNum(int max){

        return (int) (Math.random()*max);

    }







}
