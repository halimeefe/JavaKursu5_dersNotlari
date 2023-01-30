package JavaSoruÇözümleri;

import java.util.Scanner;

public class S7_MethodOlustur3unUssu {
    public static void main(String[] args) {


        //powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        // Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //Girdi:** 27
        // **Çıktı:** true
        // Açıklama: 3*3*3 =27
        //Sonuç= true



        System.out.println(powerOfThree(sayiOku()));
    }
    public static boolean powerOfThree(int sayi){
        for (int i = 3; i <=sayi ; i*=3) {
            if (i==sayi)
                return true;
        }
        return false;
    }
    public static int sayiOku(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        return sc.nextInt();
    }
}
