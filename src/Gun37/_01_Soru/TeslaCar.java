package Gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElektrik{


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBatery() {
        return "batarya 9 yıl ömrü var";
    }

    @Override
    public String drive() {
        return "auto  pilot özelliği var";
    }
}

