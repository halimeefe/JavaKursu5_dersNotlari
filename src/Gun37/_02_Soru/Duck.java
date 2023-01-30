package Gun37._02_Soru;

public class Duck extends Animals implements ISailing,IFlying{


    public Duck(String cinsi, String renk) {
        super(cinsi, renk);
    }

    @Override
    public String food() {
        return"Sebze yemeyi sever";
    }

    @Override
    public String ucar() {
        return"Alçaktan uçar";
    }

    @Override
    public String yuzer() {
        return"Çok iyi yüzücüdür";
    }
}
