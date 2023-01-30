package Gun31._03_Enum;

import javax.jws.soap.SOAPBinding;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay=Aylar.AGUSTOS;

        System.out.println("aylar.agustos:"+Aylar.AGUSTOS);


        System.out.println("ayno:"+ay);
        System.out.println("ay.günmiktar:"+ay.gunMiktar);
        System.out.println("ay.ayad:"+ay.ayAd);



    }
}
