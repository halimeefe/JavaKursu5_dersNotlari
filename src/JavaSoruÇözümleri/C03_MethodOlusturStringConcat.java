package JavaSoruÇözümleri;

import java.util.Scanner;

public class C03_MethodOlusturStringConcat {
    public static void main(String[] args) {



        //verilen iki stringi parametre olarak kabul edip
        //bu iki stringi aralarında bir boşluk olan tek bir string olarak
        //main methoda döndüren bir method oluşturun.



        String str1="java";
        String str2="candir";
        System.out.println(birlestirMethodu(str1,str2));
    }
    public static String birlestirMethodu(String str1,String str2){

        return str1+"  "+str2 ;
    }
}
