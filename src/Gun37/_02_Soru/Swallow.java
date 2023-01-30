package Gun37._02_Soru;

public class Swallow extends Animals implements IFlying{


    public Swallow(String cinsi, String renk) {
        super(cinsi, renk);
    }

    @Override
    public String ucar() {

        return"8 saat süreyle uçabilir";
    }

    @Override
    public String food() {
        return"Sinek ve böcekle beslenir";
    }
}
