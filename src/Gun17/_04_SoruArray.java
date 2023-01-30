package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _04_SoruArray {
    public static void main(String[] args) {




        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.




        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*11);//10 eleman dahil bir diziyi random (önce istenen kısım)
        }
        System.out.println(Arrays.toString(dizi));
        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)=");
        int aranaRakam=oku.nextInt();// kullanıcının gireceği bir rakamı yazdırıyoruz(ikinci istenen kısım)

        boolean bulundu=false;
        int sayac=0;
        for (int i = 0; i < dizi.length; i++) {// bir rakamı arattırınız.(rakam arıcaz)

            if (dizi[i] == aranaRakam) {        // rakamı tutturduysak
                bulundu = true;
                sayac++;// kaç tane bulunduğunu yazdırmak için sayac koyduk
                System.out.println("bulundu index:" + i);
            }
        }
            if (!bulundu)     // rakamı tutturamadıysak
                System.out.println("bulunamadı");
    }
}

