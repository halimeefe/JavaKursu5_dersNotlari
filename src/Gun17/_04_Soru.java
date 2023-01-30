package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.




        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*11);//10 eleman dahil bir diziyi random
        }
        System.out.println(Arrays.toString(dizi));
        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)=");
        int aranaRakam=oku.nextInt();// kullanıcının gireceği bir rakamı

        for (int i = 0; i < dizi.length; i++) {// bir rakamı arattırınız.
            if (dizi[i] == aranaRakam) {
                System.out.println("var oda numarası="+i+".indexde");
            }

        }



        }

    }

