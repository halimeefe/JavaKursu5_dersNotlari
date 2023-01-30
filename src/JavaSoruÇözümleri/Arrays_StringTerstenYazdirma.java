package JavaSoruÇözümleri;

import java.util.Arrays;

public class Arrays_StringTerstenYazdirma {
    public static void main(String[] args) {


        //Bir String oluşturun : "Hello World"
        //
        //Stringi tersten yazdırın ve print edin.
        //
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String cumle = "Hello World";
        for (int i = cumle.length() - 1; i >= 0; i--) {
            System.out.print(cumle.charAt(i));


//***************ARRAY İLE ÇÖZÜM**************************//
            char[] c = new char[cumle.length()];
            for (int j = 0; j < c.length; j++) {
                c[i] += cumle.charAt((c.length - 1) - i);


            }
            System.out.println(Arrays.toString(c));


        }
    }
}
