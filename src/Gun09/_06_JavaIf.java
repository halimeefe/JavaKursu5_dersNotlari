package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // girilen bir cümlede a harfinin geçip geçmediğini
        //bulunuz geçiyor ise EVET ,GEÇMİYOR ise HAYIR yazdırınız


        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle=");
        String cumle=oku.nextLine();

        if(cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a"))
            System.out.println("HAYIR");

        //2.YOL
        if(cumle.indexOf("a") != -1) //  indexof sıfırdan başlar harf olmayınca -1 gösterir
            System.out.println("EVET");   //-1 den farklı ise var demektir

        if(cumle.indexOf("a")== -1) //  Burada -1 e eşitmi demek yani a harfi yok demektir
            System.out.println("HAYIR");
        //3.YOL

        boolean varMi=cumle.contains("a");
        if(varMi==true)
            System.out.println("EVET");

        if (varMi==false)
            System.out.println("HAYIR");















    }
}
