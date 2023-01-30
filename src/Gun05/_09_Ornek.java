package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double,boyunu double olarak alınız.
        //ve bir satırda boyunuz...ve kilonuz ...şeklinde yazdırınız.
        // vucut kitle indexini de bularak yazdırın.




        Scanner oku=new Scanner(System.in);

        System.out.print("boy :");
        double boy = oku.nextDouble();

        System.out.print(" kilo:");
        double kilo = oku.nextDouble();

        double vucutKitleInd= kilo/(boy*boy );
        System.out.println("boyunuz:" +boy+" ,kilonuz :"+kilo);

        System.out.println("vucutKitleInd ="+ vucutKitleInd);















    }

}
