package Gun32._02_Encapsulatıon;

import com.sun.org.apache.xpath.internal.operations.Neg;

public class ArabaMain {

   // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {
        Araba arb1=new Araba();
        arb1.setKapiSayisi(5);
        arb1.setModel(2022);
        arb1.setRenk("kırmızı");
        arb1.setMotorHacmi(1599);
        System.out.println("arb1:"+arb1);

        Araba arb2=new Araba("mavi",2030,1600,4);// "tek kalemde tanımladık
        System.out.println("arb2:"+arb2);







    }
}
