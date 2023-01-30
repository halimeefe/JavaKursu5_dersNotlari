package JavaSoruÇözümleri;

public class ArrayKelimeSayisi {
    public static void main(String[] args) {


        // Bu Stringi oluşturun."removes white spaces from both end of a string"
        //Stringdeki kelime sayısını yazdırınız.


        String cumle = "Removes white spaces from both ends of a string";
        int bosluklar = 0;
        for (int i = 0; i < cumle.length(); i++){
            if (cumle.charAt(i) == ' ')
                bosluklar++;
        }
        System.out.println("  kelime sayısı:"+(bosluklar+1));
//**************************************************************************/
        String str1="removes white spaces from both ends of a string";
        String[]kelimeler=str1.split(" ");
        System.out.println(" kelime sayısı:"+kelimeler.length);





    }
}
