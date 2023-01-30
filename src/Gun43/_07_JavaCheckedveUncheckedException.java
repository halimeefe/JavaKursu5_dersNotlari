package Gun43;

import javax.jws.soap.SOAPBinding;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        // CHECKED VE UNCHECKED EXCEPTİON
        // JAVA DERKİ YANİ YAZILIMCI BIRAKTIĞI HATALARA UNCHECKED EXCEPTİON
        //AMA ÖYLE KOMUTLAR VAR Kİ BANA AİT : BUNLARI HATA KONTROLÜ YAPMADAN
        //YANİ TRY-CATCH E ALMADAN KULLANMAMA İZİN VERMEM BU GİBİ HATA DURUMLARINA
        //CHECKED YANİ KONTROL ETTİĞİM HATALAR DENİR.


        String str="";

        char ilkHarf=str.charAt(0);
        // Stringlerde sen bilirsin  ister try catch kullan ister kullanma

        try {

            Thread.sleep(1000); // try -catch mecbur: Checked Exception
        }
        catch (InterruptedException e){  // CHECKED EXCEPTİON
            System.out.println("hata oluştu");
        }




    }
}
