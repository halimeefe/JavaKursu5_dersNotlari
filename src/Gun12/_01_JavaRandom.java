package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

        //0-5 arası gibi sayılar ürettik, hep sıfırdan başladı
        //4-9 arası nasıl ürettirirdim
        //Yöntem şu: önce aralık kadar normal üret (9-4) yani 0-5 arası
        // üretilmiş olan sayıya min sayıyı ekle , üretilmiş sayı+4
        //(int)(Math.Random()*(max-min))+min

        //  Soru: girilen max ve min aralığında random sayı

        Scanner oku=new Scanner(System.in);
        System.out.print("min=");
        int min =oku.nextInt();

        System.out.print("max=");
        int max =oku.nextInt();

        int rndSayi=(int) (Math.random()*(max-min))+min;// formul bu kısım
        System.out.println("rndSayi ="+rndSayi);




    }
}
