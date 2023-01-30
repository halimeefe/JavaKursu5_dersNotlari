package OOP_Odev._02_Odev;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class ClctrMain {
    public static void main(String[] args) {









      Sum sum=new Sum();
        System.out.println(sum.calculating(5,1));
        System.out.println(sum.calculating(585,15));

        Divide dv=new Divide();
        System.out.println(dv.calculating(8,2));
        System.out.println(dv.calculating(585,15));

        Multiply ml=new Multiply();
        System.out.println(ml.calculating(5,2));
        System.out.println(ml.calculating(15,25));

        Substract sb=new Substract();
        System.out.println(sb.calculating(5,2));
        System.out.println(sb.calculating(5856,856));





    }

}



