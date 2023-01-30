package Gun37._01_Soru;

public class Toyota extends Vehicle implements IElektrik,IGas {


    public Toyota(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBatery() {
        return "batarya 100 km sonra değiş";
    }

    @Override
    public String cahangeOil() {
        return "1000km de yağ değiş";
    }

    @Override
    public String drive() {
        return "auto pilot özelliği var";
    }
}

