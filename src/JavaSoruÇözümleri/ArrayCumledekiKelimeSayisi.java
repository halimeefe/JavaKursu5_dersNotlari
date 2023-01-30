package JavaSoruÇözümleri;

import java.util.Scanner;

public class ArrayCumledekiKelimeSayisi {
    public static void main(String[] args) {

        // kullanıcın gireceği bir cümlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        //Bu gün hava çok güzel->5

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz:");
        String cumle=oku.nextLine();

        int boslukSayisi=0;//BOŞLUK SAYISININ BİR FAZLASI BİZE KELİME SAYISINI VERİR

        for (int i = 0; i <cumle.length(); i++) {// FOR LOOPLA CÜMLENİN UZUNLUĞUNU ALIRIZ
            if (cumle.charAt(i)==' ') // CÜMLENİN HER BİR ELEMANI BOŞLUĞA EŞİTSE
                boslukSayisi++;// BOŞLUK BİR ARTIR DERİZ

        }
        System.out.println("kelime sayısı:"+(boslukSayisi+1));// BOŞLUK ARTI BİR KELİME SAYISI ORTAYA ÇIKAR








    }
}
