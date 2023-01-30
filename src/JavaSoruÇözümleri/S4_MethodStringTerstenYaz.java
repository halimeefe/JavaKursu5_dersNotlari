package JavaSoruÇözümleri;

import java.util.Arrays;

public class S4_MethodStringTerstenYaz {
    public static void main(String[] args) {


        //adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        // Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        // Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java






        String cumle="java yazın";

       reverseWord(cumle);



        }
        public static void reverseWord(String cumle){
        String[]dizi=cumle.split(" ");
            for (int i = dizi.length-1; i >=0 ; i--) {
                if (i!=0)
                    System.out.print(dizi[i]+" ");
                else
                    System.out.println(dizi[i]);


            }
        }




    }























