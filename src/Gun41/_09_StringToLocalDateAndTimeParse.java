package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {



        // kullanıcıdan alınan ve string durumundaki time veya tarih
        //bilgisinin time veya tarih bilgisine çevrilmesi


        long startTime=System.currentTimeMillis();// kodun performansı bu şekilde ölçülüyor



        Scanner oku=new Scanner(System.in);
        System.out.print("tarih giriniz:");
        String strTarih =oku.nextLine();

        System.out.println("strTarih:"+strTarih);

        //KULLLANICININ GİRECEĞİ FORMATA GÖRE FORMAT OLUŞTURDUK
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd mm yyyy");

        //STRİNGİN FORMATI BU FORMATA UYGUN OLMALI.PARSE İLE ÇEVİRDİK
        LocalDate tarih=LocalDate.parse(strTarih,f);

        System.out.println("tarih:"+tarih);

        long finishTime=System.currentTimeMillis();//
        System.out.println("gecen süre:"+(finishTime-startTime)+"ms");





    }
}
