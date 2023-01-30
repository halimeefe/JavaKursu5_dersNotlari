package JavaSoruÇözümleri;

import java.util.Scanner;

public class SesliHarfleriSayanMethod {
    public static void main(String[] args) {


        // SORU: BİR STRİNG DE TÜM SESLİ HARFLERİ SAYAN METHOD YAZINIZ.


        Scanner oku=new Scanner(System.in);
        System.out.print(" ifade giriniz:");
        String str=oku.nextLine();
        System.out.println(countVowels(str));



    }public static int countVowels(String str)
    {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='ü'){
                count++;


            }

        }return count;
    }
}
