package Gun13;

import java.util.Scanner;

public class MentoringOdev {
    public static void main(String[] args) {


        // kullanıcıdan bir not girmesini isteyin ve bu nota
        //karşılık gelen harf notunu veren programı yazınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Not giriniz:");
        String dersNotu=read.nextLine();


        int ogrNot=Integer.parseInt(dersNotu);

        if (ogrNot >=90)
            System.out.println("A");
        else if (ogrNot >= 80)
            System.out.println("B");
        else if (ogrNot >= 70)
            System.out.println("C");
        else if (ogrNot >= 60)
            System.out.println("D");
        else if (ogrNot >=40)
            System.out.println(" E");
        else System.out.println("F");


        // girilen bir sayının haftanın hangi gününe denk geldiğini
        // yazdıran bir program yazdırınız.(switch case)


        Scanner oku = new Scanner(System.in);
        System.out.print("GÜN NO:");
        int gunNo = oku.nextInt();
        switch (gunNo) {
            case 1:System.out.println("pazartesi");break;
            case 2:System.out.println("salı");break;
            case 3:System.out.println("çarşamba");break;
            case 4: System.out.println("perşembe");break;
            case 5: System.out.println("cuma");break;
            case 6: System.out.println("cumartesi");break;
            case 7: System.out.println("pazar");break;

        }


    }


}
