package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {


        //SORU: KULLANICIDAN FİZİK :90 ŞEKLİNDE NOT  BİLGİSİ ALINIZ
        //>=90 İÇİN A
        // >=80 İÇİN B
        //>=70 İÇİN C
        // >=60 İÇİN D
        //>=40 İÇİN E
        //< 40 İÇİN F YAZDIRINIZ


        Scanner oku=new Scanner(System.in);
        System.out.print("Ders ve Notu Giriniz= ");
        String dersNotu=oku.nextLine();
        int ind = dersNotu.indexOf("=");


        //int ogrNot=Integer.parseInt;//2. yöntem
        int ogrNot=Integer.parseInt(dersNotu.substring(ind+1));

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






    }
}
