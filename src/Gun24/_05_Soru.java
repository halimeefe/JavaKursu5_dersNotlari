package Gun24;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {


        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        Map<String,String>sozluk=new TreeMap<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int secim=0;


        do {
            System.out.println("MENÜ\n1-EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4-ARAMA\n5-SİLME\n6-ÇIKIŞ\nSEÇİMİNİZ");
            secim=okuInt.nextInt();

            switch (secim){
                case 1:

                    System.out.print("Kelime giriniz:");
                    String kelime=okuStr.nextLine();
                    System.out.print("Manasını yazınız:");
                    String manasi=okuStr.nextLine();
                    sozluk.put(kelime,manasi);
                    break;
                    case 2:
                    System.out.print("Kelimede düzeltme:");
                    String duzelt=okuStr.nextLine();
                    break;
                case 3:
                    System.out.println("sozluk:"+sozluk);
                    break;
                case 5:
                    sozluk.clear();
                    break;
                case 6:
                    System.out.println("ÇIKIŞ SEÇİLDİ");
                    break;
                default:
                    System.out.println("HATALI NUMARA");

            }

        } while (secim==6);


    }
}



