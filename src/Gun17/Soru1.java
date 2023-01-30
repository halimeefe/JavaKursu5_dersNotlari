package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {


        // Ödev Soru 1: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.









        //Soru 2: Kullanıcıdan bir ülke adı alarak aşağıdaki gibi yazdırınız.
                 // e
                // ye
               // iye
              // kiye
            // rkiye
           // ürkiye
          // Türkiye

            Scanner oku = new Scanner(System.in);

            System.out.print("ülke adı:");
            String str = oku.nextLine();


            for (int i =str.length()-1; i >=0 ; i--) {

                    String parca=str.substring(i);
                    System.out.println(parca);
                }








    }





        }


