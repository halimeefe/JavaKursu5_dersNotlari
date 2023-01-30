package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {




        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");

        System.out.println("yeni şifreniz:");
        String newPassword = oku.nextLine();

       try {
           if (newPassword.length()<8) // bu mesaj ile suni hata oluştur
               throw  new Exception("ŞİFRE EN AZ 8 KARAKTERDEN OLUŞMALI");// THROW NEW EXCEPTION **KENDİ OLUŞTURACAĞIMIZ SUNİ HATALARDA KULLANIRIZ**

           if (newPassword.length()>15) // BU MESAJ İLE SUNİ HATA OLUŞTUR
               throw new Exception("ŞİFRE EN FAZLA 15 KARAKTERDEN OLUŞMALI");
       }
       catch (Exception ex)
       {
           // HATALAR BİR YERE TOPLANIP ,HEPSİ İÇİN YAPILMASI GEREKEN İŞLEMLER
           //BİRARADA BURADA YAPILABİLİR.MESELA LOG TUTMA GİBİ.
           System.out.println("lütfen dikkat !");
           System.out.println(ex.getMessage());
           // log tutma

       }
    }
}
