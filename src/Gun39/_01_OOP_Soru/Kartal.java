package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan {
    @Override
    public void yiyecegi() {
        System.out.println("et");

    }

    @Override
    public void yemekMiktari() {
        System.out.println("günlük 1kg");

    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("günlük 8 saat");
    }

    @Override
    public void sesi() {
        System.out.println("fiyuu");

    }

    public Kartal( String name, boolean vahsi, String dTarih) {
        super( name, vahsi, dTarih);
    }
}

