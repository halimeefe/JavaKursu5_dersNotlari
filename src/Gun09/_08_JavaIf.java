package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("şifre=");
        String sifre=oku.nextLine();

        System.out.print("sifre tekrar=");
        String sifreTekrar=oku.nextLine();

        boolean ayniMi=sifre.equals(sifreTekrar);// Striglerde equals kullanmalıyız
                                                 // rakamda olsa equals kullanılır



         if (ayniMi==true)
             System.out.println("AYNI");

         if (ayniMi==false)
             System.out.println("DEĞİL");















    }
}
