package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {

        // Daha öce çözdüğünüz hesap makinesi sorusunu ,
        // switch case ile çözünüz.


        Scanner oku=new Scanner(System.in);
        System.out.println("1.sayi");
        int s1=oku.nextInt();

        System.out.println("2.sayı");
        int s2=oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("çıkarma için Ç");
        System.out.println(" Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz:");
        Scanner okuStr=new Scanner(System.in);
        String secim =okuStr.next();

        switch (secim.toUpperCase())
        {
            case "T":System.out.println("TOPLAM="+(s1+s2));break;
            case "Ç":System.out.println("farkı:"+(s1-s2));break;
            case "p":System.out.println("çarpımı:"+(s1*s2));break;
            case "B":System.out.println("bölme:"+s1/s2);break;

        }






    }
}
