package Gun37._02_Soru;

public class Cat extends Animals implements IAnimal{


    public Cat(String cinsi, String renk) {
        super(cinsi, renk);
    }

    @Override
    public String food() {
        return"Kedi maması yemeyi sever";
    }
}
