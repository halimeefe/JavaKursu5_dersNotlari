package Gun21;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class  _03_ArrayList {
    public static void main(String[] args) {


        // Bir öğretmenden girmek istediği kadar notu alınız.
        //öğretmene devam etmek istiyormusunuz(E/H)şeklinde sorunuz.
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);



        ArrayList<Integer>notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;

        do {
            // not girilcek****************
            System.out.print("not:");
            int not=okuInt.nextInt();
            //notları arrayliste at***********
            notlar.add(not);
            //girilen notları topla*************
            toplam=toplam+not;
            //devam etmek istiyormusunuz(E/H)************
            System.out.print("devam etmek istiyormusunuz(E/H)");
            devamMi=okuStr.next();
        }while (devamMi.equalsIgnoreCase("E"));

        //ORTALAMAYI BUL
        int ort=toplam/notlar.size();  // NOTLARIN HEPSİ DİZİYE EKLENDİKTEN SONRA ORTALAMAYI BULABİLİRİZ
        //geçen sayısını bul;
        System.out.println("ort:"+ort);
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ort)
                gecenSayisi++;

        }
        System.out.println("geçen sayısı:"+gecenSayisi);



















    }




    }

