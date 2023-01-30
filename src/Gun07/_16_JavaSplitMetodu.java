package Gun07;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class _16_JavaSplitMetodu {
    public static void main(String[] args) {




// split : BİR STRİNGİ PARÇALARA AYIRMAK DEMEK
        // KULLANICIDAN ALACAĞINIZ CUMLEYİ KELİMELERİNE GÖRE ALT ALTA YAZDIRINIZ.


        Scanner oku=new Scanner(System.in);
        System.out.print("cümle:");
        String cumle=oku.nextLine();


        String[]kelimeler=cumle.split(" ");

        for (int i=0; i<kelimeler.length; i++) {

        }


        System.out.println("kelimeler :" + kelimeler);



    }
}
