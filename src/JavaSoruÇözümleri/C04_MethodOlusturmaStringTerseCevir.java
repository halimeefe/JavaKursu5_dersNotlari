package JavaSoruÇözümleri;

import javax.jws.soap.SOAPBinding;

public class C04_MethodOlusturmaStringTerseCevir {
    public static void main(String[] args) {

        // parametre olarak bir String kabul edip
        // Stringin terse çevrilmiş halini döndüren bir method oluşturun.


        String input = "java kod yazdıkça öğrenilir";
        System.out.println(stringiTerseCevirRevors(input));

    }
    public static String stringiTerseCevirRevors(String input) {
        String tersStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {

            tersStr =tersStr+ input.charAt(i);

        }
        return tersStr;

    }
}




