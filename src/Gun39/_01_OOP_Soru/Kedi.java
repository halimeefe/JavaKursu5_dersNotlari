package Gun39._01_OOP_Soru;

import javax.jws.soap.SOAPBinding;

public class Kedi extends Hayvan{
    public Kedi( String name, boolean vahsi, String dTarih) {
        super( name, vahsi, dTarih);
    }

    @Override
    public void yiyecegi() {
        System.out.println("mama ve balık");

    }

    @Override
    public void yemekMiktari() {
        System.out.println("100gr");

    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("16 saat");

    }

    @Override
    public void sesi() {
        System.out.println("miyav");

    }
}
