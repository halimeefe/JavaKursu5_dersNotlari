package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {


        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();

        if (sayi%2 !=0)  // 1 veya -1 mi  düşünerek ünlem işareti koyduk ve 0 koyduk negatifleri
            System.out.println("sayı tektir");//kapsasın diye 0 koyduk sadece o hariç tek sayı  için 1 koyardık
        // != bu işaret farklı ise demektir

        if (sayi%2==0) // modul koyarız sayının 2 ye bölümünden 1 kalırsa tektir
            System.out.println("sayı çifttir");// != ünlem işareti farklı ise demektir




    }
}
