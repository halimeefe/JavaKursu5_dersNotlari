package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {

        //10 elemanlı bir diziyi random olarak doldurduktan sonra 10 dahil
        //tekrarlı değerleri almayacak şekilde yeni bir diziye atınız.



       Integer[]dizi=new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);// 10 elemanlı diziyi doldurduk bu kısımda
        }System.out.println("Random seçilen dizi:"+ Arrays.toString(dizi));// burada yazdırdık
        // 1.YÖNTEM

        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < dizi.length; i++) {// tekrarlı değerleri hashset almaz
            hs.add(dizi[i]);// Bu kısımda yeni hashset diziyi tanımladık ve  YENİ BİR DİZİYE ATADIK yazdırdık
        }
        System.out.println("hs:"+hs);

        //2.YÖNTEM

        HashSet<Integer>hs2=new HashSet<>(Arrays.asList(dizi));//2.YÖNTEM TEK KALEMDE DİZMEMİZİ SAĞLAR
        System.out.println("hs2:"+hs2);// VE YAZDIRDIK

        //3.YÖNTEM
        HashSet<Integer> hs3 = new HashSet<>();
        Collections.addAll(hs3,dizi);  // COLLECTIONS.ADDALL HEPSİNİ TOPLU OLARAK DİZİYE ATAR
        System.out.println("hs3:"+hs3);// BUDA 3. YÖNTEM HASHSET OLARAK YAZDIRMA KISMI

    }// **********YAZILIMDA DAHA ÇOK BİRİNCİ YÖNTEM KULLANILIYOR********//

}