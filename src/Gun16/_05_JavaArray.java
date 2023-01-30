package Gun16;

import java.util.Date;
import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {



        //5 tv kanalın ismini bir diziye doldurunuz
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.


        String []dizi={ "trt","atv","kanald","fox","habertürk"};

        int rnd=(int)(Math.random()* dizi.length);
        System.out.println("Rast gele seçilen tv:"+   dizi[rnd]);




        }












    }

