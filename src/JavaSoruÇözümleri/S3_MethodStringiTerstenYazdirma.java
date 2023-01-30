package JavaSoruÇözümleri;

import java.util.Arrays;

public class S3_MethodStringiTerstenYazdirma {
    public static void main(String[] args) {

        // reverseString isminde bir method oluşturun.
        // Bu method bir String'i parametre olarak alsın.
        // Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        // Örn: String = "Java'yı Seviyorum."
        // Print: .muroyiveS ıy'avaJ

        String cumle = "Java'yı  Seviyorum.";

        System.out.println(reverseString(cumle));

    }public static String reverseString(String cumle){
        String tersStr="";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersStr=tersStr+cumle.charAt(i);


        }return tersStr;











        }











    }

