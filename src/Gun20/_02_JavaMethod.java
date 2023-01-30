package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {

        // kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir methoda
        //yaptıktan sonra main de yazdırınız
        Scanner oku = new Scanner(System.in);

        System.out.println("1.SAYI GİRİNİZ");
        int a = oku.nextInt();
        System.out.println("2.sayı giriniz:");
        int b = oku.nextInt();

       int enb=enbBul(a,b);
        System.out.println("enb="+enb);
    }

    public static int enbBul(int a, int b) {

        return a>b ?a:b;//1.yöntem
        //2.yöntem
       // if (a>b) {
         //   return a;
         //   else
         //   return b;
        }




    }

